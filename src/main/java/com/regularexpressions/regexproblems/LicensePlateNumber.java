package com.regularexpressions.replaceandmodify.regexproblems;

import java.util.regex.*;

public class LicensePlateNumber {
    public static void main(String[] args) {
        //regex patter for strong username
        String regex = "^[A-Z]{2}\\d{4}$";
        Pattern pattern = Pattern.compile(regex);
        //Numbers to validate
        String[] numbers = {"JH1234", "MP5678", "BH9012", "UP3456", "MH7890"};
        //run loop to check each number and print result
        for (String number : numbers) {
            Matcher matcher = pattern.matcher(number);
            System.out.println(number + " matches? : " + matcher.matches());
        }
    }
}
