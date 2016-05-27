package org.springboot.rest.demo.service;

import org.springboot.rest.demo.domain.Contact;
import org.springboot.rest.demo.repository.ContactRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

@Service
@Validated
public class ContactServiceImpl implements ContactService{
    private static final Logger LOGGER = LoggerFactory.getLogger(ContactServiceImpl.class);
    private final ContactRepository repository;

    @Inject
    public ContactServiceImpl(final ContactRepository repository) {
        this.repository = repository;
    }

    /**
     * Save the Contact
     * @param contact
     * @return
     */
    @Transactional
    public Contact save(@NotNull @Valid final Contact contact) {
        LOGGER.debug("Creating {}", contact);
        return repository.save(contact);
    }

    /**
     * Get the list of Contacts
     * @return
     */
    @Transactional(readOnly = true)
    public List<Contact> getList() {
        LOGGER.debug("Retrieving the list of all users");
        return repository.findAll();
    }

    /**
     * Delete the Contact
     * @param id
     */
    @Override
    public void delete(String id) {
        repository.delete(id);
    }

}
