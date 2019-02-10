package com.bunkware.bc.boardCafe.Dto;

import java.io.Serializable;

public class LoyaltyDto implements Serializable {

    private Customer customer;
    private int pointsToAdd;


    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getPointsToAdd() {
        return pointsToAdd;
    }

    public void setPointsToAdd(int pointsToAdd) {
        this.pointsToAdd = pointsToAdd;
    }
}
