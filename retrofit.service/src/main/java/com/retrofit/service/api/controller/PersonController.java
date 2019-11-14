package com.retrofit.service.api.controller;

import com.retrofit.service.api.model.Person;
import com.retrofit.service.api.service.impl.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonServiceImpl service;

    @GetMapping("/all")
    public Person getPerson(){
        return service.getPerson();
    }
}
