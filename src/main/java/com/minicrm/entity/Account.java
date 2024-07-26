package com.minicrm.entity;

import javax.persistence.*;

import java.util.List;

@Entity
@Table(name="accounts")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="account_id")
    private Integer accountId;
    private String accountName;
    private String accountOwner;
    private Integer phone;
    private String fax;
    private String website;
    private double annualRevenue;
    private String industry;
    private String billingAddress;
    private String shippingAddress;
    private String accountSite;
    private String sicCode;
    private String description;


    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "account_id",insertable = false,updatable = false)
    private List<Contact> contacts;

    public Integer getAccountId(Integer accountId) {
        return this.accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getAccountName(String accountName) {
        return this.accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountOwner() {
        return accountOwner;
    }

    public void setAccountOwner(String accountOwner) {
        this.accountOwner = accountOwner;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public double getAnnualRevenue() {
        return annualRevenue;
    }

    public void setAnnualRevenue(double annualRevenue) {
        this.annualRevenue = annualRevenue;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public String getAccountSite() {
        return accountSite;
    }

    public void setAccountSite(String accountSite) {
        this.accountSite = accountSite;
    }

    public String getSicCode() {
        return sicCode;
    }

    public void setSicCode(String sicCode) {
        this.sicCode = sicCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
