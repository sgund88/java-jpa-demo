package com.crud.hibernet.demo.model;

import lombok.Data;

@Data
public class PersonAndMessage {
    private long id;
    private String firstName;
    private String lastName;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String zipCode;
    private String message;
}
