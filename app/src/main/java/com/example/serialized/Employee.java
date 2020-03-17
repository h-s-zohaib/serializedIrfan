package com.example.serialized;

import com.google.gson.annotations.SerializedName;

public class Employee {
    @SerializedName("firstName")
    private String Name;
    @SerializedName("age")
    private int ages;
    @SerializedName("mail")
    private String gmail;

    public Employee(String firstName, int age, String mail) {
        this.Name = firstName;
        this.ages = age;
        this.gmail = mail;
    }
}
