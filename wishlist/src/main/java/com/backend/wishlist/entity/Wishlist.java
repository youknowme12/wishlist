package com.backend.wishlist.entity;

import jakarta.persistence.*;

@Entity
public class Wishlist {

    @Id
    @GeneratedValue
    private int ID;

    private String productName;

    private int productId;

    private String description;

    private int price;

    public Wishlist(){

    }

    public Wishlist(int id, String productName, int productID, String description, int amount){
        this.ID = id;
        this.productName = productName;
        this.productId = productID;
        this.description = description;
        this.price = amount;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductID() {
        return productId;
    }

    public void setProductID(int productID) {
        this.productId = productID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
