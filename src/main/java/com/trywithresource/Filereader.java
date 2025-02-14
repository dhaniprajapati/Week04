package com.trywithresource;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Filereader {
    // method to read and print the first line of the file
    public static void readFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            // read and print the first line of the file
            String firstLine = reader.readLine();
            System.out.println("First line: " + firstLine);
        }
        //catch and handle io exception
        catch (IOException e) {
            System.out.println("Error");
        }
    }
    public static void main(String[] args) {
        String fileName= "C:\\Users\\praja\\OneDrive\\Desktop\\Week04\\Day04\\src\\main\\java\\com\\trywithresource\\text.txt";
        // call method
        readFile(fileName);
    }
}
