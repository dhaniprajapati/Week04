package com.setinterface;

import java.util.HashSet;
import java.util.Set;

public class FindSubsets {
    //method to find and check for subset
    public static <T> boolean isSubset(Set<T> set1, Set<T> set2) {
        //check if all elements of set1 are present in set2
        for (T element : set1) {
            //if any element is not found, set1 is not a subset
            if (!set2.contains(element)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        //create the sets and add elements
        Set<Integer> set1 = new HashSet<>();
        set1.add(2);
        set1.add(1);
        Set<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);
        //check if set1 is a subset of set2
        boolean result = isSubset(set1, set2);
        //print the result
        System.out.println(result);
    }
}

