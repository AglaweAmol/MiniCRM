package com.minicrm.controller;

import com.minicrm.payload.LeadDTO;
import com.minicrm.service.LeadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class LeadController {

    @Autowired
    private LeadService leadService;

   public LeadController(LeadService leadService)
   {
      this.leadService=leadService;
   }


   @PostMapping("/leads")
  public ResponseEntity<LeadDTO> createLead(@RequestBody LeadDTO leadDTO)
  {
      return new ResponseEntity<>(leadService.createLead(leadDTO), HttpStatus.CREATED);
  }

  @GetMapping("/leads/{id}")
  public ResponseEntity<LeadDTO> getLeadById(@PathVariable(name="id") long id)
  {
      return ResponseEntity.ok(leadService.getLeadById(id));
  }

  @PutMapping("/leads/{id}")
    public ResponseEntity<LeadDTO> updateLeadById(@RequestBody LeadDTO leadDTO,@PathVariable(name="id") long id)
  {
      LeadDTO updateLeaddto=leadService.updateLead(leadDTO, id);
      return new ResponseEntity<>(updateLeaddto,HttpStatus.OK);
  }




}
