package com.bunkware.myapplication.Objects;

import java.io.Serializable;

public class CafeMenuItem implements Serializable {

    private String itemName;
    private String itemId;
    private String itemDesc;
    private double price;
    private boolean peanutSafe;
    private boolean shellfish;
    private boolean gluten;


    public CafeMenuItem() {}

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isPeanutSafe() {
        return peanutSafe;
    }

    public void setPeanutSafe(boolean peanutSafe) {
        this.peanutSafe = peanutSafe;
    }

    public boolean isShellfish() {
        return shellfish;
    }

    public void setShellfish(boolean shellfish) {
        this.shellfish = shellfish;
    }

    public boolean isGluten() {
        return gluten;
    }

    public void setGluten(boolean gluten) {
        this.gluten = gluten;
    }
}
