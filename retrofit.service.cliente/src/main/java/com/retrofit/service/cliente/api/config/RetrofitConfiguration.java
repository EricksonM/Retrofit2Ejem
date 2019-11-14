package com.retrofit.service.cliente.api.config;

import com.retrofit.service.cliente.api.proxy.PersonProxy;
import okhttp3.OkHttpClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Configuration
public class RetrofitConfiguration {

    private static final String BASE_URL = "http://localhost:8686";

    private OkHttpClient.Builder httpClient = new OkHttpClient.Builder();

    @Bean
    Retrofit PersonApiClient(){
        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(httpClient.build())
                .build();
    }

    @Bean
    public PersonProxy retrofit(){
        return PersonApiClient().create(PersonProxy.class);
    }


}
