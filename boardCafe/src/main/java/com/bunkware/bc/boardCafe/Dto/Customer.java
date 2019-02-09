package com.bunkware.bc.boardCafe.Dto;

import javax.persistence.Entity;

@Entity
public class Customer {

    private String firstName;
    private String lastName;
    private String email;
    private int    areaCode;
    private int    phoneNumber;
    private int    loyaltyPoints;
    private int    customerId;


    public Customer() {
    }

    public Customer(String firstName, String lastName, String email, int areaCode, int phoneNumber, int loyaltyPoints, int customerId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.areaCode = areaCode;
        this.phoneNumber = phoneNumber;
        this.loyaltyPoints = loyaltyPoints;
        this.customerId = customerId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(int areaCode) {
        this.areaCode = areaCode;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public void setLoyaltyPoints(int loyaltyPoints) {
        this.loyaltyPoints = loyaltyPoints;
    }
}
