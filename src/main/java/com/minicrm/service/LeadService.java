package com.minicrm.service;

import com.minicrm.payload.LeadDTO;

public interface LeadService {

    LeadDTO createLead(LeadDTO leadDTO);

    LeadDTO getLeadById(Long id);


    LeadDTO updateLead(LeadDTO leadDTO,long id);

    LeadDTO deleteById(Long id);




}
