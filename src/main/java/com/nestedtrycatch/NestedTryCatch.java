package com.nestedtrycatch;

import java.util.Scanner;

public class NestedTryCatch {
    // Method to access array and divide
    public static void divisionInArray(int[] arr, int index, int divisor) {
        try {
            // Nested try-catch block to perform function and catch exceptions
            try {
                int element = arr[index];
                try {
                    int result = element / divisor;
                    System.out.println("Result: " + result);
                } catch (ArithmeticException e) {
                    System.out.println("Cannot divide by zero!");
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid array index!");
            }
        } catch (Exception e) {
            System.out.println("Unexpected error occurred: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking user inputs
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the index to access: ");
        int index = sc.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = sc.nextInt();

        // Calling the method
        divisionInArray(arr,index,divisor);

        sc.close();
    }
}
