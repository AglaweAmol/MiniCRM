package com.minicrm.service;

import com.minicrm.payload.LeadDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface LeadService {

    LeadDTO createLead(LeadDTO leadDTO);

    LeadDTO getLeadById(Long id);


    LeadDTO updateLead(LeadDTO leadDTO,long id);

    LeadDTO deleteById(Long id);


    Page<LeadDTO> getAllLeads(Pageable pageable);




}
