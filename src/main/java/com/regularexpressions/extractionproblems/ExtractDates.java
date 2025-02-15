package com.regularexpressions.replaceandmodify.extractionproblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractDates {
    public static void main(String[] args) {
        String text= "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";
        String regex= "\\b(\\d{2}/\\d{2}/\\d{4})\\b";
        // Compile the regex pattern
        Pattern pattern = Pattern.compile(regex);
        // Create a Matcher object for the text
        Matcher matcher = pattern.matcher(text);
        // Loop through all matches and add them to the list
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
