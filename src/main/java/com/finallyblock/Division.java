package com.finallyblock;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        // create scanner object
        Scanner scanner = new Scanner(System.in);
        //try block to perform division
        try {
            // take user input
            System.out.print("Enter the dividend: ");
            int dividend = scanner.nextInt();
            System.out.print("Enter the divisor: ");
            int divisor = scanner.nextInt();
            // perform division
            int result = dividend / divisor;
            System.out.println("Result: " + result);
        //catch block to catch and handle the exception
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } // finally block always executes
        finally {
            System.out.println("Operation completed");
            scanner.close();
        }
    }
}