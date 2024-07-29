package com.minicrm.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name="accounts")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="account_id")
    private Long accountId;

    @Column(name = "account_name")
    private String accountName;

    @Column(name = "account_owner")
    private String accountOwner;

    @Column(name = "phone")
    private Long phone;

    @Column(name = "fax")
    private String fax;

    @Column(name = "website")
    private String website;

    @Column(name = "annual_revenue")
    private double annualRevenue;

    @Column(name = "industry")
    private String industry;

    @Column(name = "billing_address")
    private String billingAddress;

    @Column(name = "shipping_address")
    private String shippingAddress;

    @Column(name = "account_site")
    private String accountSite;

    @Column(name = "sic_code")
    private String sicCode;

    @Column(name = "description")
    private String description;





@OneToMany
@JoinColumn(name="account_id")
private Set<Deals> deals;



}
