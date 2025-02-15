package com.regularexpressions.replaceandmodify;

public class ReplaceMultipleSpaces {
    public static void main(String[] args) {
        String text = "This    is  an     example   with         multiple        spaces.";
        // Replace multiple spaces with one space
        String replacedText = text.replaceAll("\\s+", " ");
        System.out.println("Original: " + text);
        System.out.println("Formatted: " + replacedText);
    }
}
