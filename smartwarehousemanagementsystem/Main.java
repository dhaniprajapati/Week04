package com.smartwarehousemanagementsystem;

public class Main {
    public static void main(String[] args) {
        //create objects of different items
        Electronics electronics1 = new Electronics("Laptop", 56000);
        Electronics electronics2 = new Electronics("Washing Machine", 45000);
        Electronics electronics3 = new Electronics("Phone", 19000);
        Groceries groceries1 = new Groceries("Apple", 180);
        Groceries groceries2 = new Groceries("Milk", 40);
        Furniture furniture = new Furniture("Chair", 100);

        //create a storage object for WarehouseItems
        Storage<WarehouseItem> storage = new Storage<>();

        //add items to storage
        storage.addItem(electronics1);
        storage.addItem(electronics2);
        storage.addItem(electronics3);
        storage.addItem(groceries1);
        storage.addItem(groceries2);
        storage.addItem(furniture);

        //display items in storage
        storage.displayItems();
    }
}
