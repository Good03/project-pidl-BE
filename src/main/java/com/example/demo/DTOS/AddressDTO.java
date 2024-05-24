package com.example.demo.DTOS;

import lombok.Data;

@Data
public class AddressDTO {
     private String id;
     private String username;
     private String city;
     private String street;
     private String house;
     private String postcode;
     private String countrycode;
}
