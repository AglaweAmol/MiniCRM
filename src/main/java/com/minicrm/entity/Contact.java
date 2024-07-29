package com.minicrm.entity;

import lombok.Data;

import javax.persistence.*;

import java.util.Date;


@Data
@Entity
@Table(name="contact")
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long conatactId;
    private String contactFirstName;
    private String contactLastName;
    private String email;
    private Integer phone;
    private Integer mobile;
    private String address;
    private String city;
    private String state;
    private String country;
    private Integer zipCode;
    private String jobTitle;
    private String department;
    private String leadSource;
    private String description;
    private Date dateOfBirth;
    private String company;
    private String website;

//    @ManyToOne
//    @JoinColumn(name = "account_id")
//    private Account account;
}
