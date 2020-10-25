package com.crm.crm.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity

public class Contact {
    private @Id
    @GeneratedValue
    Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;

    public Contact() {
    }

    public Contact(String firstName, String lastName, String email, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
    }

}
