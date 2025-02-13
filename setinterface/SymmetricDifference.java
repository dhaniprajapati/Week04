package com.setinterface;

import java.util.HashSet;
import java.util.Set;

public class SymmetricDifference {
    //method to find symmetric difference in elements present in set
    public static <T> Set<T> findSymmetricDifference(Set<T> set1, Set<T> set2){
        Set<T> result = new HashSet<>(set1);
        Set<T> symmetricDifference = new HashSet<>(set1);
        //add all elements of set2 to the symmetricDifference set
        symmetricDifference.addAll(set2);
        //create a temporary set that contains all elements of set1
        Set<T> temp = new HashSet<>(set1);
        //retain only the elements in temp that are also in set2 (common elements)
        temp.retainAll(set2);
        //remove all common elements from the symmetricDifference set
        symmetricDifference.removeAll(temp);
        return symmetricDifference;
    }
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(2);
        set2.add(5);
        //call the method and print result
        Set<Integer> result = findSymmetricDifference(set1, set2);
        System.out.println(result);
    }
}

