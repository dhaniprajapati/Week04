package com.regularexpressions.replaceandmodify.regexproblems;
import java.util.regex.Pattern;
import java.lang.String;

public class ValidateUsername {
    public static void main(String[] args) {
        //regex pattern for strong username
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[_])[A-Za-z\\d_]{5,15}$";
        //compile the regex pattern
        Pattern pattern = Pattern.compile(regex);
        //usernames to validate
        String[] usernames = {"prajapatidhani06", "aNshu_123", "Akanshu123_", "Miracle_123", "Valid_123@"};
        //run loop to check each username and print result
        for (String username : usernames) {
            System.out.println(username + " matches? : " + pattern.matcher(username).matches());
        }
    }
}
