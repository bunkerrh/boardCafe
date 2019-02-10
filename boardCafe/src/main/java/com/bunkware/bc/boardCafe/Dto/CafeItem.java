package com.bunkware.bc.boardCafe.Dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
@Entity
public class CafeItem implements Serializable
{

    private int cafeItemId;
    private double price;
    private String itemName;
    private String desc;
    private int typeId;
    private String cafeItemImagePath;
    public CafeItem() {
    }

    public CafeItem(int cafeItemId, double price, String itemName, String desc, int typeId, String imagePath) {
        this.cafeItemId = cafeItemId;
        this.price = price;
        this.itemName = itemName;
        this.desc = desc;
        this.typeId = typeId;
        this.cafeItemImagePath = imagePath;
    }

    public String getCafeItemImagePath() {
        return cafeItemImagePath;
    }

    public void setCafeItemImagePath(String cafeItemImagePath) {
        this.cafeItemImagePath = cafeItemImagePath;
    }

    public int getCafeItemId() {
        return cafeItemId;
    }

    public void setCafeItemId(int cafeItemId) {
        this.cafeItemId = cafeItemId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }
}
