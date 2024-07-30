package com.minicrm.controller;


import com.minicrm.payload.DealDTO;
import com.minicrm.payload.LeadDTO;
import com.minicrm.service.DealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class DealController {


    @Autowired
    private DealService dealService;

    public DealController(DealService dealService) {
        this.dealService = dealService;
    }


    @PostMapping("/deals")
    public ResponseEntity<DealDTO> createDeal(@RequestBody DealDTO dealDTO)
    {
        return new ResponseEntity<>(dealService.creatDeal(dealDTO), HttpStatus.CREATED);
    }


    @GetMapping("/deals/{id}")
    public ResponseEntity<DealDTO> getDealById(@PathVariable(name="id") Long id)
    {
        return ResponseEntity.ok(dealService.getDealById(id));
    }

    @PutMapping("/deals/{id}")
    public  ResponseEntity<DealDTO> uddateDealById(@RequestBody DealDTO dealDTO,@PathVariable(name="id") Long id)
    {

        DealDTO dealDTO1=dealService.updateDealById(dealDTO,id);
        return new ResponseEntity<>(dealDTO1,HttpStatus.OK);
    }


    @GetMapping("/deals")
    public ResponseEntity<Page<DealDTO>> getAllDeals(@RequestParam(value = "page",defaultValue = "0")int page,
                                                     @RequestParam(value = "size",defaultValue = "10")int size)
    {
        Pageable pageable= PageRequest.of(page, size);
        Page<DealDTO> deals=dealService.getAllDeals(pageable);
        return ResponseEntity.ok(deals);
    }





}
