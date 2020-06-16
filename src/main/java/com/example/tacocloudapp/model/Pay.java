package com.example.tacocloudapp.model;

import lombok.Data;

@Data
public class Pay {
    private String name;
    private String street;
    private String city;
    private String state;

    private String zip;

    private String ccNumber;

    private String ccExpiration;

    private String ccCVV;

}
