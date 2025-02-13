package com.listinterface;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ElementsFrequency {
    //method to check the frequency of the elements in a list
    public static Map<String, Integer> countFrequency(List<String> list){
        Map<String, Integer> frequencyMap = new HashMap<>();
        //run loop through the list to check each element
        for(int i=0; i<list.size(); i++){
            String element= list.get(i);
            //if list contains element, increase the count
            if(frequencyMap.containsKey(element)){
                frequencyMap.put(element,frequencyMap.get(element)+1);
            }
            else{
                frequencyMap.put(element, 1);
            }
        }
        return frequencyMap;
    }
    public static void main(String[] args){
        //create an object for list
        List<String> inputList= List.of("apple", "banana", "apple", "orange", "kiwi", "banana");
        //call the method and print details
        Map<String, Integer> frequencyMap= countFrequency(inputList);
        System.out.println(frequencyMap);
    }
}
