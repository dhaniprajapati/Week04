package com.setinterface;

import java.util.ArrayList;
import java.util.List;

public class UnionAndIntersectionOfSets {
    //method tp compute union of two sets
    public static List<Integer> computeUnion(List<Integer> set1, List<Integer> set2) {
        List<Integer> unionSet = new ArrayList<>(set1);
        //run loop to perform union of two set
        for (Integer element : set2) {
            if (!unionSet.contains(element)) {
                unionSet.add(element);
            }
        }
        return unionSet;
    }
    //method to compute intersection between two sets
    public static List<Integer> computeIntersection(List<Integer> set1, List<Integer> set2) {
        List<Integer> intersectionSet = new ArrayList<>();
        //loop through sets to check for element
        for (Integer element : set1) {
            if (set2.contains(element)) {
                intersectionSet.add(element);
            }
        }
        return intersectionSet;
    }
    public static void main(String[] args) {
        List<Integer> set1 = new ArrayList<>();
        List<Integer> set2 = new ArrayList<>();
        //adding elements to Set1
        set1.add(1);
        set1.add(2);
        set1.add(3);
        //adding elements to Set2
        set2.add(1);
        set2.add(4);
        set2.add(5);
        //call the methods and print result
        List<Integer> unionSet = computeUnion(set1, set2);
        System.out.println("Union: " + unionSet);
        List<Integer> intersectionSet = computeIntersection(set1, set2);
        System.out.println("Intersection: " + intersectionSet);
    }

}
