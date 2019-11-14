package com.retrofit.service.cliente.api.service;

import com.retrofit.service.cliente.api.model.PersonResponse;

import java.io.IOException;

public interface PersonClientService {

    public PersonResponse getPerson()  throws IOException;
}
