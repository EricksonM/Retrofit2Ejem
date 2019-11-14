package com.retrofit.service.cliente.api.expose.web;

import com.retrofit.service.cliente.api.model.PersonResponse;
import com.retrofit.service.cliente.api.service.impl.PersonClientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/client")
public class PersonController {

    @Autowired
    private PersonClientServiceImpl service;

    @GetMapping("/all")
    public PersonResponse getPerson() throws IOException {
        return service.getPerson();
    }
}
