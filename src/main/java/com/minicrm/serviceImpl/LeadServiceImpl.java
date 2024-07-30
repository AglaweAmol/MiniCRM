package com.minicrm.serviceImpl;

import com.minicrm.entity.Contact;
import com.minicrm.entity.Leads;
import com.minicrm.exception.ResourceNotFoundException;
import com.minicrm.payload.LeadDTO;
import com.minicrm.repository.LeadRepository;
import com.minicrm.service.LeadService;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
public class LeadServiceImpl implements LeadService {


    private LeadRepository leadRepository;

    private ModelMapper mapper;

    public LeadServiceImpl(LeadRepository leadRepository,ModelMapper mapper)
    {
        this.leadRepository=leadRepository;
        this.mapper=mapper;
    }
    @Override
    public LeadDTO createLead(LeadDTO leadDTO) {

       Leads leads=mapToEntity(leadDTO);
       Leads leadnew=leadRepository.save(leads);
       LeadDTO leadresponse=mapToDto(leadnew);

      return leadresponse;
    }

    @Override
    public LeadDTO getLeadById(Long id) {

        Leads leads= leadRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException(""));

        return mapToDto(leads);
    }

    @Override
    public LeadDTO updateLead(LeadDTO leadDTO, long id) {
        Leads leads=leadRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException(""));
        leads.setLeadSource(leadDTO.getLeadSource());
        leads.setLeadStatus(leadDTO.getLeadStatus());
        leads.setId(leadDTO.getId());
        leads.setEmail(leadDTO.getEmail());
        leads.setAddress(leadDTO.getAddress());
        leads.setCompanyName(leadDTO.getCompanyName());
        leads.setFirstName(leadDTO.getFirstName());
        leads.setPassword(leadDTO.getPassword());
        Leads updateLead=leadRepository.save(leads);
        return mapToDto(updateLead);
    }

    @Override
    public LeadDTO deleteById(Long id) {
        Leads leads=leadRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException(""));

        leadRepository.delete(leads);

        return mapToDto(leads);
    }

    @Override
    public Page<LeadDTO> getAllLeads(Pageable pageable) {

        return leadRepository.findAll(pageable).map(leads -> mapToDto(leads));
    }

    // convert Entity into DTO
    private LeadDTO mapToDto(Leads leads)
    {
        LeadDTO leadDTO= mapper.map(leads,LeadDTO.class);
        return leadDTO;
    }

//convert DTO to entity

    private Leads mapToEntity(LeadDTO leadDTO)
    {
       Leads leads= mapper.map(leadDTO,Leads.class);
       return leads;
    }
}
