package com.example.serialized;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Gson gson = new Gson();
//        Employee employee = new Employee("zohaib", 24 , "h.s.zohaib333@gmail.com");
//        String json = gson.toJson(employee);
    String json = "{\"firstName\":\"Zohaib\",\"age\":24\"mail\"h.s.zohaib333@gmail.com\"}";
    Employee employee = gson.fromJson(json, Employee.class);
    }
}
