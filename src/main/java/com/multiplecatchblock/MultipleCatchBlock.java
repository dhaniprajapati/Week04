package com.multiplecatchblock;

import java.util.Scanner;

public class MultipleCatchBlock {
    public static void main(String[] args) {
        // create scanner object
        Scanner scanner = new Scanner(System.in);

        // initialize array with null value
        Integer[] array = null;

        // take user input for length of array
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        // check if size is greater than zero before initializing array
        if (size > 0) {
            array = new Integer[size];
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }
        }

        // take user input for index to retrieve value
        System.out.print("Enter the index to retrieve: ");
        int index = scanner.nextInt();

        // try to access array element and catch and handle exceptions
        try {
            System.out.println("Value at index " + index + ": " + array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        }
        scanner.close();
    }
}
