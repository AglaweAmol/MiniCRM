package com.minicrm.payload;


import lombok.Data;

@Data
public class LeadDTO {
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
