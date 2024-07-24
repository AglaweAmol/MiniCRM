package com.minicrm.service.impl;

import com.minicrm.entity.Leads;
import com.minicrm.payload.LeadDTO;
import com.minicrm.repository.LeadRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;


@Service
public class LeadServiceImpl implements LeadService{


    private LeadRepository leadRepository;

    private ModelMapper mapper;

    public LeadServiceImpl(LeadRepository leadRepository)
    {
        this.leadRepository=leadRepository;
    }
    @Override
    public LeadDTO createLead(LeadDTO leadDTO) {

       Leads leads=mapToEntity(leadDTO);
       Leads leadnew=leadRepository.save(leads);
       LeadDTO leadresponse=mapToDto(leadnew);

      return leadresponse;
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
