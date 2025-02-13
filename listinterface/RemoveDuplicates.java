package com.listinterface;

import java.util.*;

public class RemoveDuplicates {
    //method to remove duplicate elements from a list
    public static List<Integer> removeDuplicates(List<Integer> list) {
        List<Integer> result = new ArrayList<>();
        //run loop through the list to check the elements
        for(Integer num : list) {
            if (!result.contains(num)) {
                result.add(num);
            }
        }
        // return result
        return result;
    }
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(3, 3, 2, 2, 3, 4, 1, 5, 6, 3, 5);
        //call the method and print result
        List<Integer> output = removeDuplicates(input);
        System.out.println(output);
    }
}
