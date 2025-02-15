package com.junit;

import java.util.ArrayList;
import java.util.List;

public class ManagingList {
    // Method to add an element to the list
    public void addElement(List<Integer> list, int element) {
        list.add(element);
    }
    // Method to remove an element from the list
    public void removeElement(List<Integer> list, int element) {
        list.remove(Integer.valueOf(element));
    }
    // Method to get the size of the list
    public int getSize(List<Integer> list) {
        return list.size();
    }
    public static void main(String[] args) {
        ManagingList manager = new ManagingList();
        // Create a new list of integers
        List<Integer> list = new ArrayList<>();
        // Add elements to the list
        manager.addElement(list, 5);
        manager.addElement(list, 10);
        manager.addElement(list,20);
        System.out.println("List after adding elements: " + list);
        // Remove an element from the list
        manager.removeElement(list, 5);
        System.out.println("List after removing element: " + list);
        // Get the size of the list
        int size = manager.getSize(list);
        System.out.println("Size of the list: " + size);
    }
}
