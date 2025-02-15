package com.junit;
public class ExceptionHandling {
    // Method to perform division and handle division by zero
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a / b;
    }

    public static void main(String[] args) {
        ExceptionHandling exceptionHandling = new ExceptionHandling();
        // try and catch block for division by zero
        try {
            int result = exceptionHandling.divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
