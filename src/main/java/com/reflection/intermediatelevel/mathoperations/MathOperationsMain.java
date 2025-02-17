package com.reflection.intermediatelevel.mathoperations;

import java.lang.reflect.Method;
import java.util.Scanner;

class MathOperations {
    public int add(int a,int b){
        return a+b;
    }
    public int subtract(int a, int b){
        return a-b;
    }
    public int multiply(int a, int b){
        return a*b;
    }
    public int divide(int a, int b){
        if(b == 0){
            System.out.println("cannot divide by 0.");
        }
        return a/b;
    }
}
public class MathOperationsMain{
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a= sc.nextInt();
        System.out.println("Enter second number: ");
        int b= sc.nextInt();
        //take user input for method name to call
        System.out.print("Enter the operation (add, subtract, multiply, divide): ");
        String operation = sc.next();
        MathOperations operations= new MathOperations();
        //get the method dynamically based on user input
        Class<?> cls = operations.getClass();
        //create instance for method
        Method method;
        // select method based on user input
        if (operation.equals("add")) {
            method = cls.getDeclaredMethod("add", int.class, int.class);
        } else if (operation.equals("subtract")) {
            method = cls.getDeclaredMethod("subtract", int.class, int.class);
        } else if (operation.equals("multiply")) {
            method = cls.getDeclaredMethod("multiply", int.class, int.class);
        } else if (operation.equals("divide")) {
            method = cls.getDeclaredMethod("divide", int.class, int.class);
        } else {
            System.out.println("Invalid operation.");
            return;
        }
        int result= (int) method.invoke(operations,a, b);
        System.out.println("Result: "+result);
    }
}
