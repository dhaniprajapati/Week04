package com.reflection.basiclevel;

import java.lang.reflect.Method;

class Calculator {
    private int multiply(int a, int b) {
        return a * b;
    }
}
public class InvokePrivateMethod {
    public static void main(String[] args) throws Exception {
        Calculator calculator = new Calculator();
        // get the private method
        Method multiplyMethod = Calculator.class.getDeclaredMethod("multiply", int.class, int.class);
        // make the method accessible
        multiplyMethod.setAccessible(true);
        // invoke the private method
        int result = (int) multiplyMethod.invoke(calculator, 5, 10);
        System.out.println("Result: " + result);
    }
}
