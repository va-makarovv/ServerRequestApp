package com.example.serverrequestapp.source;

import com.example.serverrequestapp.domain.Car;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CarApi {

    @GET("/car")
    Call<List<Car>> getCars();
}
