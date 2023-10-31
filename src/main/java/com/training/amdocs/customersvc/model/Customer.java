package com.training.amdocs.customersvc.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long customerId;
    private String userName;
    private String name;
    private int noOfOrders;
    private Date dateOfAccount;
    private boolean premium;
    private String email;

    public Customer(long customerId, String userName, String name, int noOfOrders, Date dateOfAccount, boolean premium, String email) {
        this.customerId = customerId;
        this.userName = userName;
        this.name = name;
        this.noOfOrders = noOfOrders;
        this.dateOfAccount = dateOfAccount;
        this.premium = premium;
        this.email = email;
    }

    public Customer() {
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOfOrders() {
        return noOfOrders;
    }

    public void setNoOfOrders(int noOfOrders) {
        this.noOfOrders = noOfOrders;
    }

    public Date getDateOfAccount() {
        return dateOfAccount;
    }

    public void setDateOfAccount(Date dateOfAccount) {
        this.dateOfAccount = dateOfAccount;
    }

    public boolean isPremium() {
        return premium;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
