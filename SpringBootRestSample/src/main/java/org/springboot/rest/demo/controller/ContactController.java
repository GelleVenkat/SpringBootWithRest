package org.springboot.rest.demo.controller;

import org.springboot.rest.demo.domain.Contact;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.util.List;

import org.springboot.rest.demo.service.ContactService;

/**
 * Controller Class to perform Contact CRUD  operations
 */
@RestController
public class ContactController {
    private final ContactService contactService;

    @Inject
    public ContactController(final ContactService contactService) {
        this.contactService = contactService;
    }

    /**
     *Method to list the Contacts
     * @return
     */
    @RequestMapping(value = "/contact", method = RequestMethod.GET)
    public List<Contact> listContacts() {
        List<Contact> contacts = contactService.getList();
        return contacts;
    }

    /**
     * Method to add the Contact
     * @param id
     * @param contactName
     * @param email
     * @param profession
     */
    @RequestMapping(value="/addContact",method = RequestMethod.GET)
    public void addContact(@RequestParam(value = "id", required = true) String id,
                            @RequestParam(value = "contactName", required = false) String contactName,
                            @RequestParam( value = "email", required = false) String email,
                            @RequestParam(value = "profession", required = false) String profession){
        Contact contact = new Contact(id, contactName,email,profession);
        contactService.save(contact);
    }

    /**
     * Method to delete the contact
     * @param id
     */
    @RequestMapping(value="/delete",method = RequestMethod.GET)
    public void deleteContact(@RequestParam(value = "id", required = false) String id){
        contactService.delete(id);
    }
}
