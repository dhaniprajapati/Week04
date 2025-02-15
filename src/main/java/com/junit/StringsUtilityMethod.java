package com.junit;
public class StringsUtilityMethod {
    // Method to reverse a string
    public static String reverse(String str) {
        if (str == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }
        return str.equalsIgnoreCase(reverse(str));
    }
    // Method to convert a string to uppercase
    public static String toUpperCase(String str) {
        if (str == null) {
            return null;
        }
        return str.toUpperCase();
    }
    public static void main(String[] args) {
        String input = "madam";
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + StringsUtilityMethod.reverse(input));
        System.out.println("Is Palindrome: " + StringsUtilityMethod.isPalindrome(input));
        System.out.println("Uppercase: " + StringsUtilityMethod.toUpperCase(input));
    }
}
