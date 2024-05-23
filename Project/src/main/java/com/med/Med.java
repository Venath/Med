package com.med;

public class Med {
    private String name;
    private String dose;
    private double price;
    private String category;
    private String description;
    private int quantity;

    public Med(String name, String dose, double price, String category, String description, int quantity) {
        this.name = name;
        this.dose = dose;
        this.price = price;
        this.category = category;
        this.description = description;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public String getDose() {
        return dose;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

   
}
