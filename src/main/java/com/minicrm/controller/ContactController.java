package com.minicrm.controller;

import com.minicrm.payload.ContactDTO;
import com.minicrm.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class ContactController {

    @Autowired
    private ContactService contactService;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }



    @GetMapping("/contacts/{id}")
    public ResponseEntity<ContactDTO> getContactById(@PathVariable(name="id") Long id){
        return ResponseEntity.ok(contactService.getContactById(id));
    }

    @PostMapping("/contacts")
    public ResponseEntity<ContactDTO> createContact(@RequestBody ContactDTO contactDTO)
    {
        return new ResponseEntity<>(contactService.createContact(contactDTO),HttpStatus.CREATED);
    }

    @PutMapping("/contacts/{id}")
    public ResponseEntity<ContactDTO> updateContactById(@RequestBody ContactDTO contactDTO,@PathVariable(name="id") Long id)
    {
        ContactDTO contactDTO1=contactService.updateContactById(contactDTO,id);

        return new ResponseEntity<>(contactDTO1,HttpStatus.OK);
    }

}
