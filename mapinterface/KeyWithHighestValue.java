package com.mapinterface;

import java.util.*;

public class KeyWithHighestValue {
    public static String findMaxKey(Map<String, Integer> map) {
        // check if the map is empty
        if (map.isEmpty()) {
            return null;
        }
        // initialize variables to track the max value and key
        String maxKey = null;
        int maxValue = Integer.MIN_VALUE;
        // iterate through the map to find the max value
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        return maxKey;
    }
    public static void main(String[] args) {
        Map<String, Integer> inputMap = new HashMap<>();
        inputMap.put("Apple", 10);
        inputMap.put("Ball", 15);
        inputMap.put("Cat", 25);
        //key with the highest value
        String maxKey = findMaxKey(inputMap);
        System.out.println(maxKey);
    }
}
