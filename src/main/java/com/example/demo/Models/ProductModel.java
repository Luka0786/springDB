package com.example.demo.Models;

public class ProductModel
{
    private int id, webshopID, quantity;
    private String title;
    private double price;

    public ProductModel(int id, int webshopID, int quantity, String title, double price) {
        this.id = id;
        this.webshopID = webshopID;
        this.quantity = quantity;
        this.title = title;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getWebshopID() {
        return webshopID;
    }

    public void setWebshopID(int webshopID) {
        this.webshopID = webshopID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
