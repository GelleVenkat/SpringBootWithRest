package org.springboot.rest.demo.repository;


import org.springboot.rest.demo.domain.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * ContactRepository Class
 */
public interface ContactRepository extends JpaRepository<Contact, String> {
}
