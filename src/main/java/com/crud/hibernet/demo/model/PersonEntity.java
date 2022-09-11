package com.crud.hibernet.demo.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="person")
public class PersonEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "address1")
    private String addressLine1;
    @Column(name = "address2")
    private String addressLine2;
    @Column(name = "city")
    private String city;
    @Column(name = "zip_code")
    private String zipCode;
}
