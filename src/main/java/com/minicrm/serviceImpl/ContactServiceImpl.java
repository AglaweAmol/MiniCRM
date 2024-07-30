package com.minicrm.serviceImpl;

import com.minicrm.entity.Account;
import com.minicrm.entity.Contact;
import com.minicrm.exception.ResourceNotFoundException;
import com.minicrm.payload.AccountDTO;
import com.minicrm.payload.ContactDTO;
import com.minicrm.repository.ContactRepository;
import com.minicrm.service.ContactService;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
public class ContactServiceImpl implements ContactService {


    private ContactRepository contactRepository;

    private ModelMapper mapper;

    public ContactServiceImpl(ContactRepository contactRepository, ModelMapper mapper) {
        this.contactRepository = contactRepository;
        this.mapper = mapper;
    }

    @Override
    public ContactDTO createContact(ContactDTO contactDTO) {

        Contact contact=mapToEntity(contactDTO);
        Contact createContact=contactRepository.save(contact);
        ContactDTO contactRepsonse=mapToDto(createContact);
        return contactRepsonse;
    }

    @Override
    public ContactDTO getContactById(Long id) {

        Contact contact=contactRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException(""));
        return mapToDto(contact);
    }

    @Override
    public ContactDTO updateContactById(ContactDTO contactDTO, Long id) {
        Contact contact=contactRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException(""));
        contact.setAddress(contactDTO.getAddress());
        contact.setCity(contactDTO.getCity());
        contact.setContactFirstName(contactDTO.getContactFirstName());
        contact.setContactLastName(contactDTO.getContactLastName());
        contact.setCompany(contactDTO.getCompany());
        contact.setPhone(contactDTO.getPhone());
        contact.setCountry(contactDTO.getCountry());
        contact.setEmail(contactDTO.getEmail());
        Contact updateContact= contactRepository.save(contact);
        return mapToDto(updateContact);
    }

    @Override
    public ContactDTO deleteById(Long id) {
        Contact contact=contactRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException(""));
        contactRepository.delete(contact);
        return mapToDto(contact);
    }



    public Page<ContactDTO> getAllContacts(Pageable pageable)
    {
        return contactRepository.findAll(pageable)
                .map(contact -> mapToDto(contact));
    }

    private ContactDTO mapToDto(Contact contact)
    {
        ContactDTO contactDTO=mapper.map(contact,ContactDTO.class);
        return contactDTO;
    }

    private Contact mapToEntity(ContactDTO contactDTO)
    {
        Contact contact=mapper.map(contactDTO,Contact.class);
        return  contact;
    }
}
