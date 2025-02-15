package com.regularexpressions.advanceproblems;

import java.util.regex.*;

public class ValidateIPAddress {
    // method to validate the IP address
    public static boolean isValidIPv4(String ipAddress) {
        String regex = "^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\."
                + "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\."
                + "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\."
                + "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
        //compile the regex pattern
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(ipAddress);
        // return result
        return matcher.matches();
    }
    public static void main(String[] args) {
        String ipAddress = "192.168.1.1";
        System.out.println(isValidIPv4(ipAddress));
    }
}
