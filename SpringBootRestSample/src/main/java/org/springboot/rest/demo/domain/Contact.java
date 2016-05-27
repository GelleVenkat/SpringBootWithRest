package org.springboot.rest.demo.domain;



import org.hibernate.validator.constraints.Email;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Contact Entity class
 */
@Entity
public class Contact {
    @Id
    @NotNull
    @Size(max = 64)
    @Column(name = "id", nullable = false, updatable = false)
    private String id;

    @NotNull
    @Size(max = 64)
    @Column(name = "name", nullable = false)
    private String name;

    @NotNull
    @Size(max = 64)
    @Column(name = "email", nullable = false)
    @Email
    private String email;

    @NotNull
    @Size(max = 64)
    @Column(name = "profession", nullable = false)
    private String profession;

    /**
     * Default Constructor
     */
    public Contact() {
    }

    /**
     * Overloaded constructor
     * @param id
     * @param name
     * @param email
     * @param profession
     */
    public Contact(String id, String name, String email, String profession) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.profession = profession;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", profession='" + profession + '\'' +
                '}';
    }
}
