package com.bunkware.bc.boardCafe.Dto;

import javax.persistence.Entity;
import java.io.Serializable;

@Entity
public class Rental implements Serializable
{
  private double rentalPrice;
  private String desc;
  private String name;
  private int    rentalId;
  private String rentalImagePath;


    public Rental() {
    }

    public Rental(double rentalPrice, String desc, String name, int rentalId, String rentalImagePath) {
        this.rentalPrice = rentalPrice;
        this.desc = desc;
        this.name = name;
        this.rentalId = rentalId;
        this.rentalImagePath = rentalImagePath;
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

    public int getRentalId() {
        return rentalId;
    }

    public void setRentalId(int rentalId) {
        this.rentalId = rentalId;
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
}
