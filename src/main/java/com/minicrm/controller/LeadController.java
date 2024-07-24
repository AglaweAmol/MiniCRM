package com.minicrm.controller;

import com.minicrm.payload.LeadDTO;
import com.minicrm.service.impl.LeadService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/leads")
public class LeadController {

    private LeadService leadService;

   public LeadController(LeadService leadService)
   {
      this.leadService=leadService;
   }

  public ResponseEntity<LeadDTO> createLead(@RequestBody LeadDTO leadDTO)
  {
      return new ResponseEntity<>(leadService.createLead(leadDTO), HttpStatus.CREATED);
  }


}
