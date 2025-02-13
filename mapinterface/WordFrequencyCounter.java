package com.mapinterface;


import java.util.*;

public class WordFrequencyCounter {
    public static Map<String, Integer> countWordFrequency(String text) {
        Map<String, Integer> wordCount = new HashMap<>();

        // remove punctuation and convert text to lowercase
        text = text.replaceAll("[^a-zA-Z ]", "").toLowerCase();
        // split text into words
        String[] words = text.split("\\s+");
        // loop to update word count in the hashmap
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        return wordCount;
    }
    public static void main(String[] args) {
        String text = "Hello world, hello Java!";
        Map<String, Integer> result = countWordFrequency(text);
        System.out.println(result);
    }
}

