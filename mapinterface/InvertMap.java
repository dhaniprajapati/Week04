package com.mapinterface;
import java.util.*;

public class InvertMap {
    //method to invert map
    public static <K, V> Map<V, List<K>> invertMap(Map<K, V> map) {
        Map<V, List<K>> invertedMap = new HashMap<>();
        // iterate through the original map
        for (Map.Entry<K, V> entry : map.entrySet()) {
            V value = entry.getValue();
            K key = entry.getKey();
            // add key to the list of values
            invertedMap.computeIfAbsent(value, k -> new ArrayList<>()).add(key);
        }
        return invertedMap;
    }
    public static void main(String[] args) {
        Map<String, Integer> inputMap = new HashMap<>();
        inputMap.put("Apple", 1);
        inputMap.put("Ball", 2);
        inputMap.put("Cat", 3);
        Map<Integer, List<String>> inverted = invertMap(inputMap);

        System.out.println(inverted);
    }
}
