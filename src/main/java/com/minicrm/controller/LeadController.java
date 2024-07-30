package com.minicrm.controller;

import com.minicrm.payload.LeadDTO;
import com.minicrm.service.LeadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
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
  public ResponseEntity<LeadDTO> getLeadById(@PathVariable(name="id") Long id)
  {
      return ResponseEntity.ok(leadService.getLeadById(id));
  }

  @PutMapping("/leads/{id}")
    public ResponseEntity<LeadDTO> updateLeadById(@RequestBody LeadDTO leadDTO,@PathVariable(name="id") long id)
  {
      LeadDTO updateLeaddto=leadService.updateLead(leadDTO, id);
      return new ResponseEntity<>(updateLeaddto,HttpStatus.OK);
  }



  @GetMapping("/leads")
  public ResponseEntity<Page<LeadDTO>> getAllLeads(@RequestParam(value = "page",defaultValue = "0") int page,
                                                   @RequestParam(value = "size",defaultValue = "10") int size)
  {

      Pageable pageable= PageRequest.of(page, size);
      Page<LeadDTO> leadsnew=leadService.getAllLeads(pageable);

      return ResponseEntity.ok(leadsnew);

  }




}
