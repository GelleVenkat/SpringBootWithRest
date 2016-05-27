package org.springboot.rest.demo.service;


import org.springboot.rest.demo.domain.Contact;


import java.util.List;

/**
 * Contact Service Class
 */
public interface ContactService {
    Contact save(Contact contact);

    /**
     * Fetch all the contacts
     * @return
     */
    List<Contact> getList();

    /**
     * Delete the contact
     * @param id
     */
    void delete(String id);
}
