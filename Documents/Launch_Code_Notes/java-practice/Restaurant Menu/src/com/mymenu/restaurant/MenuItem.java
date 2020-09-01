package com.mymenu.restaurant;

public class MenuItem {
    private String name;
    private Double price;
    private String description;
    private String category;
    private boolean newItem;

    private MenuItem(String name, Double price, String description, String category) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.newItem = true;
    }


    public String getName(){
        return name;
    }

    public Double getPrice(){
        return price;
    }

    public String getDescription(){
        return description;
    }

    public String getCategory(){
        return category;
    }

    public boolean getNewItem(){
        return newItem;
    }
}
