package com.annotation.supressuncheckedwarnings;

import java.util.ArrayList;

public class SupressUncheckedWarning {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        //create an ArrayList
        ArrayList list = new ArrayList();
        //adding elements to the list
        list.add("Hello");
        list.add("world");
        list.add("java");
        //retrieving and printing elements
        for (Object item : list) {
            System.out.println(item);
        }
    }
}
