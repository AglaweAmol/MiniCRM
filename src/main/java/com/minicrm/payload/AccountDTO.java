package com.minicrm.payload;


import lombok.Data;

import java.util.Set;

@Data
public class AccountDTO {

    private Long accountId;
    private String accountName;
    private String accountOwner;
    private Long phone;
    private String fax;
    private String website;
    private double annualRevenue;
    private String industry;
    private String billingAddress;
    private String shippingAddress;
    private String accountSite;
    private String sicCode;
    private String description;

    private Set<DealDTO> deals;
}
