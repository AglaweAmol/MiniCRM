package com.minicrm.service;

import com.minicrm.payload.AccountDTO;
import com.minicrm.payload.ContactDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ContactService {

    ContactDTO createContact(ContactDTO contactDTO);

    ContactDTO getContactById(Long id);

    ContactDTO updateContactById(ContactDTO contactDTO,Long id);

    ContactDTO deleteById(Long id);


    Page<ContactDTO> getAllContacts(Pageable pageable);


}
