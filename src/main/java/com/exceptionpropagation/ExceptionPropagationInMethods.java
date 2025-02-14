package com.exceptionpropagation;

public class ExceptionPropagationInMethods {
    // method1 throws ArithmeticException
    public static void method1() {
        int result = 10 / 0;
    }
    // method2 calls method1
    public static void method2() {
        method1();
    }
    //method 3 handles the exception
    public static void main(String[] args) {
        try {
            // Calling method2, which will propagate the exception from method1
            method2();
        } catch (ArithmeticException e) {
            System.out.println("Handled exception in main");
        }
    }
}

