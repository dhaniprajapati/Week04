package com.smartwarehousemanagementsystem;

public class Groceries extends WarehouseItem {

    public Groceries(String name, double price) {
        super(name, price);
    }

    @Override
    public void displayDetails() {
        System.out.println("Groceries: " + getName() + ", Price: " + getPrice());
    }
}