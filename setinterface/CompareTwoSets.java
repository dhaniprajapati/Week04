package com.setinterface;
import java.util.HashSet;
import java.util.Set;

public class CompareTwoSets {
    //method to check if two sets are equal
    public static boolean areSetsEqual(int[] set1, int[] set2) {
        Set<Integer> setA=new HashSet<>();
        Set<Integer> setB=new HashSet<>();
        //iterate through the sets
        for(int num:set1){
            setA.add(num);
        }
        for(int num:set2){
            setB.add(num);
        }
        return setA.equals(setB);
    }
    public static void main(String[] args) {
        int[] set1={1,2,3};
        int[] set2={2,1,3};

        //check if the sets are equal
        boolean result=areSetsEqual(set1,set2);
        //print the result
        System.out.println(result);
    }
}
