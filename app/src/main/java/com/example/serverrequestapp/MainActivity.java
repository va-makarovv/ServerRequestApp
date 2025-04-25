package com.example.serverrequestapp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.serverrequestapp.domain.Car;
import com.example.serverrequestapp.source.CarApi;
import com.example.serverrequestapp.source.RetroFitClient;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        CarApi carApi = RetroFitClient.getApi();
        textView = findViewById(R.id.tv_cars);

        carApi.getCars().enqueue(new Callback<List<Car>>() {
            @Override
            public void onResponse(Call<List<Car>> call, Response<List<Car>> response) {
                if (response.isSuccessful()){
                    List<Car> cars = response.body();
                    cars.forEach((c) -> textView.append(c.toString()));
                }
            }

            @Override
            public void onFailure(Call<List<Car>> call, Throwable t) {

            }
        });

    }
}