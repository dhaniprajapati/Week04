package com.regularexpressions.advanceproblems;
import java.util.regex.*;

public class ExtractCurrencyValues {
    public static void main(String[] args) {
        String text = "The price is $45.99, and the discount is 10.50.";

        // Regular expression to match currency values (e.g., "$45.99", "10.50")
        String regex = "\\$?\\d+\\.\\d{2}";
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
