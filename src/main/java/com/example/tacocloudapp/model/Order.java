package com.example.tacocloudapp.model;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import lombok.Data;

import org.hibernate.validator.constraints.CreditCardNumber;

@Data
public class Order {

    @NotBlank(message = "Customer Name is required")
    private String name;

    @NotBlank(message = "Street is required")
    private String street;

    @NotBlank(message = "City is required")
    private String city;

    @NotBlank(message = "State is required")
    private String state;

    @NotBlank(message = "Zipcode is required")
    private String zip;

    @Digits(integer=10, message="Not a valid credit card number", fraction = 0)
    private String ccNumber;

    @Pattern(regexp="^(0[1-9]|1[0-2])([/])([1-9][0-9])$", message="Must be formatted MM/YY")
    private String ccExpiration;

    @Digits(integer=3, fraction=0, message="Invalid CVV")
    private String ccCVV;
}