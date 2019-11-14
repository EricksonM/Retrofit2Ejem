package com.retrofit.service.api.service.impl;

import com.retrofit.service.api.model.Person;
import com.retrofit.service.api.service.PersonService;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {
    @Override
    public Person getPerson() {
        Person person = new Person(1, "John", "frusciante@email.com");
        return person;
    }
}
