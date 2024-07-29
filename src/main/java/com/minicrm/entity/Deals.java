package com.minicrm.entity;

import javax.persistence.*;
import java.util.Date;



@Entity
@Table(name="contact")
public class Deals {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    public Integer getDealId() {
        return dealId;
    }

    public void setDealId(Integer dealId) {
        this.dealId = dealId;
    }

    public String getDealName() {
        return dealName;
    }

    public void setDealName(String dealName) {
        this.dealName = dealName;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getDealStage() {
        return dealStage;
    }

    public void setDealStage(String dealStage) {
        this.dealStage = dealStage;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getClosingDate() {
        return closingDate;
    }

    public void setClosingDate(Date closingDate) {
        this.closingDate = closingDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getProbability() {
        return probability;
    }

    public void setProbability(String probability) {
        this.probability = probability;
    }

    public String getLeadSource() {
        return leadSource;
    }

    public void setLeadSource(String leadSource) {
        this.leadSource = leadSource;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCampaignSource() {
        return campaignSource;
    }

    public void setCampaignSource(String campaignSource) {
        this.campaignSource = campaignSource;
    }

    public String getNextStep() {
        return nextStep;
    }

    public void setNextStep(String nextStep) {
        this.nextStep = nextStep;
    }
}

