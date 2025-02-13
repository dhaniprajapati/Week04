package com.smartwarehousemanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public void removeItem(T item) {
        items.remove(item);
    }

    public void displayItems() {
        for (T item : items) {
            item.displayDetails();
        }
    }

    public List<? extends WarehouseItem> getItems() {
        return items;
    }
}
