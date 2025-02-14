package com.checkedexception;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IOexceptionHandling {
    //method to read the text file
    public static String readFile(String filePath) {
        //create a StringBuilder object
        StringBuilder sb = new StringBuilder();
        //try and catch method to catch the exception
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            //loop to read test line by line and append the line to StringBuilder
            while ((line = br.readLine()) != null) {
                sb.append(line);
                sb.append("\n");
            }
            //IO exception if there is any error in reading file
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        //input file path to read the text
        String filePath = "C:\\Users\\praja\\OneDrive\\Desktop\\Week04\\src\\main\\java\\com\\checkedexception\\input.txt";
        //call method and print details
        String fileContent = readFile(filePath);
        System.out.println(fileContent);
    }
}
