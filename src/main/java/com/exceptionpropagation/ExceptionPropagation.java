package com.exceptionpropagation;

public class ExceptionPropagation {
    // method to calculate interest throws IllegalArgumentException if amount or rate is negative
    public static double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException {
        if (amount < 0 || rate < 0) {
            throw new IllegalArgumentException("Amount and rate must be positive");
        }
        //return interest amount
        return (amount * rate * years) / 100;
    }
    public static void main(String[] args) {
        //try and catch block
        try {
            double interest = calculateInterest(3400, 3, 5);
            System.out.println("Interest: " + interest);
        } catch (IllegalArgumentException e) {
            System.out.println("Amount and rate must be positive");
        }
    }
}
