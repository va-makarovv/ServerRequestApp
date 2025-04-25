package com.example.serverrequestapp.source;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroFitClient {

    private static final String SERVER_BASE_URL = "http://localhost:8081";

    private static Retrofit retrofit = null;

    public static CarApi getApi(){
        if (retrofit == null){
            retrofit =  new Retrofit.Builder().baseUrl(SERVER_BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit.create(CarApi.class);

    }
}
