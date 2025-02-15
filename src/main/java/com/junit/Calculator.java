package com.junit;

public class Calculator {
    //addition
    public int add(int a, int b) {
        return a + b;
    }
    //subtraction
    public int subtract(int a, int b) {
        return a - b;
    }
    //multiplication
    public int multiply(int a, int b) {
        return a * b;
    }
    //division
    public int divide(int a, int b) {
        //exception if division by 0 is performed
        if (b == 0) {
            throw new ArithmeticException("Division by zero.");
        }
        return a / b;
    }
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Addition: " + calculator.add(2, 3));
        System.out.println("Subtraction: " + calculator.subtract(9, 3));
        System.out.println("Multiplication: " + calculator.multiply(2, 3));
        System.out.println("Division: " + calculator.divide(6, 2));
        //try and catch block to catch and handle exception
        try {
            calculator.divide(1, 0);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

