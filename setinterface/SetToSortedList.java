package com.setinterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetToSortedList {
    public static void main(String[] args) {
        //create set object and add elements
        Set<Integer> set = new HashSet<>();
        set.add(6);
        set.add(8);
        set.add(4);
        set.add(9);
        //convert the set to a list
        List<Integer> list = new ArrayList<>(set);
        //sort the list in ascending order
        Collections.sort(list);
        //Print the sorted list
        System.out.println(list);
    }
}
