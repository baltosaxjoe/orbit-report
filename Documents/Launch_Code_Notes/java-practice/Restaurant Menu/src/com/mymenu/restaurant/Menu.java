package com.mymenu.restaurant;


import java.util.ArrayList;
import java.util.HashMap;

public class Menu {
    ArrayList<MenuItem> menuItems;
    String dateModified;

    public Menu(ArrayList<MenuItem> menuItems, String dateModified) {
        this.menuItems = menuItems;
        this.dateModified = dateModified;
    }

public ArrayList<MenuItem> addMenuItem(MenuItem anItem){
    menuItems.add(anItem);
    return menuItems;
    }

public ArrayList<MenuItem> removeMenuItem(MenuItem anItem){
    menuItems.remove(anItem);
    return menuItems;
}
}
