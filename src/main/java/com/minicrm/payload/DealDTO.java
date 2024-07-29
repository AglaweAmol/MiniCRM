package com.minicrm.payload;

import lombok.Data;

import java.util.Date;


@Data
public class DealDTO {

    private Integer dealId;
    private String dealName;
    private String accountName;
    private String contactName;
    private String dealStage;
    private double amount;
    private Date closingDate;
    private String type;
    private String probability;
    private String leadSource;
    private String description;
    private String campaignSource;
    private String nextStep;

}
