package com.retrofit.service.cliente.api.proxy;

import com.retrofit.service.cliente.api.model.PersonResponse;
import retrofit2.Call;
import retrofit2.http.GET;

import java.io.IOException;

public interface PersonProxy {

    @GET("/person/all")
    Call<PersonResponse> getPerson();

}
