package com.listinterface;

import java.util.ArrayList;
import java.util.LinkedList;

public class ReverseList {
    //method to reverse ArrayList
    public static ArrayList<Integer> reverseArrayList(ArrayList<Integer> list) {
        ArrayList<Integer> reversedList = new ArrayList<>();
        //loop through list from last to first index
        for (int i = list.size()-1; i>=0; i--){
            reversedList.add(list.get(i));
        }
        //return result
        return reversedList;
    }
    //method to reverse LinkedList
    public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> list) {
        LinkedList<Integer> reversedList = new LinkedList<>();
        //loop through list from last to first index
        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }
        return reversedList;
    }
    public static void main(String[] args) {
        //create an object of array list and add elements
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        //print reversed Arraylist
        ArrayList<Integer> reversedList = reverseArrayList(list);
        System.out.println("Reversed ArrayList: " +reversedList);
        //print reversed Linkedlist
        LinkedList<Integer> linkedList = new LinkedList<>(list);
        LinkedList<Integer> reverseList = reverseLinkedList(linkedList);
        System.out.println("Reversed LinkedList: "+reverseList);
    }
}
