package com.customexception;

import java.util.Scanner;

public class InvalidAgeException extends Exception {
    //method to validate the age
    public static void validateAge(int age) throws InvalidAgeException{
        //age must be greater than or equal to 18
        if(age<=18){
            throw new InvalidAgeException();
        }
        System.out.println("Valid age.");
    }
    public static void main(String[] args) throws InvalidAgeException {
        //create scanner object for user input
        Scanner sc= new Scanner(System.in);
        //taking user input
        System.out.println("Enter valid age: ");
        int age= sc.nextInt();
        //try block to validate age
        try{
            validateAge(age);
        }
        //catch exception and print message
        catch (InvalidAgeException e) {
            System.out.println("Exception found. Invalid age entered.");
        }
    }
}
