package com.uncheckedexception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideTwoNumbers {
    public static void main(String[] args) {
        //create scanner for user input
        Scanner sc = new Scanner(System.in);
        //try block to divide two numbers
        try {
            System.out.println("Enter first number: ");
            int dividend = sc.nextInt();
            System.out.println("Enter second number: ");
            int divisor = sc.nextInt();
            int result = dividend/ divisor;
            System.out.println("Result: " + result);
        //catch arithmetic exception and print message
        } catch (ArithmeticException e) {
            System.out.println("Exception because the divisor is 0");
        //catch inputmismatchexception and print message
        } catch (InputMismatchException e) {
            System.out.println("Exception because non-numeric data given as input.");
        }
    }
}
