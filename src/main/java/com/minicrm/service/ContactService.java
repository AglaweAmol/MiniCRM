package com.minicrm.service;

import com.minicrm.payload.ContactDTO;

public interface ContactService {

    ContactDTO createContact(ContactDTO contactDTO);

    ContactDTO getContactById(Long id);

    ContactDTO updateContactById(ContactDTO contactDTO,Long id);

    ContactDTO deleteById(Long id);
}
