package com.minicrm.payload;


import lombok.Data;
import org.springframework.http.HttpStatusCode;

@Data
public class AccountDTO {

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

}
