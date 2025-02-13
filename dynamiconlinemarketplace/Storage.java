package com.dynamiconlinemarketplace;


import java.util.ArrayList;
import java.util.List;

public class Storage<T> {
    private List<T> itemList = new ArrayList<>();

    public void addItem(T item) {
        itemList.add(item);
    }

    public List<T> getList() {
        return itemList;
    }
}