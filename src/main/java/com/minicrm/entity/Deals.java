package com.minicrm.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;


@Data
@Entity
@Table(name="deals")
public class Deals {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long dealId;
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



//    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
//    @JoinColumn(name = "account_id")
//    private Account account;


}

