package com.minicrm.entity;

import jakarta.persistence.*;

@Entity
@Table(name="leads")
public class Leads {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String email;

    private String password;

    private String firstName;

    private String lastName;

    private String companyName;

    private String Address;

    private String leadSource;

    private String leadStatus;

}
