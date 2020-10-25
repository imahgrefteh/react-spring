package com.crm.crm.model;

import com.crm.crm.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DemoLoader implements CommandLineRunner {

    private final ContactRepository contactRepository;

    @Autowired
    public DemoLoader(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;

    }

    @Override
    public void run(String... args) throws Exception {
        this.contactRepository.save(new Contact("Emmanuel", "Henri", "me@me.com", "33333"));
    }
}
