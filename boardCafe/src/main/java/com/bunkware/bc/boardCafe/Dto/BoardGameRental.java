package com.bunkware.bc.boardCafe.Dto;

import javax.persistence.Column;
import javax.persistence.Entity;


//These would likely be domains
@Entity
public class BoardGameRental
{
    private int minPlayers;
    private int maxPlayers;
    private int suggestedAge;
    private int    rentalId;
    private double rentalPrice;
    private String desc;
    private String name;
    private String rentalImagePath;


    public BoardGameRental() {
    }


    public BoardGameRental(int minPlayers, int maxPlayers, int suggestedAge, int rentalId, double rentalPrice, String desc, String name, String rentalImagePath) {
        this.minPlayers = minPlayers;
        this.maxPlayers = maxPlayers;
        this.suggestedAge = suggestedAge;
        this.rentalId = rentalId;
        this.rentalPrice = rentalPrice;
        this.desc = desc;
        this.name = name;
        this.rentalImagePath = rentalImagePath;
    }

    public int getRentalId() {
        return rentalId;
    }

    public void setRentalId(int rentalId) {
        this.rentalId = rentalId;
    }

    public double getRentalPrice() {
        return rentalPrice;
    }

    public void setRentalPrice(double rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRentalImagePath() {
        return rentalImagePath;
    }

    public void setRentalImagePath(String rentalImagePath) {
        this.rentalImagePath = rentalImagePath;
    }

    public int getMinPlayers() {
        return minPlayers;
    }

    public void setMinPlayers(int minPlayers) {
        this.minPlayers = minPlayers;
    }

    public int getMaxPlayers() {
        return maxPlayers;
    }

    public void setMaxPlayers(int maxPlayers) {
        this.maxPlayers = maxPlayers;
    }

    public int getSuggestedAge() {
        return suggestedAge;
    }

    public void setSuggestedAge(int suggestedAge) {
        this.suggestedAge = suggestedAge;
    }
}
