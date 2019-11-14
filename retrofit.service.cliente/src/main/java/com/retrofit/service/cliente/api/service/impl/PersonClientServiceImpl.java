package com.retrofit.service.cliente.api.service.impl;

import com.retrofit.service.cliente.api.model.PersonResponse;
import com.retrofit.service.cliente.api.proxy.PersonProxy;
import com.retrofit.service.cliente.api.service.PersonClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import retrofit2.Response;

import java.io.IOException;

@Service
public class PersonClientServiceImpl implements PersonClientService {

    @Autowired
    private PersonProxy personProxy;

    @Override
    public PersonResponse getPerson() throws IOException {
        Response<PersonResponse> personResponse = personProxy.getPerson().execute();
        PersonResponse response = personResponse.body();
        return response;
    }
}
