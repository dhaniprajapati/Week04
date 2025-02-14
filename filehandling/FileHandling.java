package com.filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileHandling {
    // method to read from the source file and write to the destination file
    public static void readFile(String filePath, String output) {
        try (FileInputStream fis = new FileInputStream(filePath);
             FileOutputStream fos = new FileOutputStream(output)) {
            // buffer array to store data
            byte[] buffer = new byte[1024];
            //variable to store the length of data read
            int length;
            // reading the input file and writing it to the destination
            while ((length = fis.read(buffer)) > 0) {
                fos.write(buffer, 0, length);
            }
            System.out.println("File contents successfully copied to destination file.");
        //catch block to catch exception
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        String filePath = "C:\\Users\\praja\\OneDrive\\Desktop\\Week04\\Day03\\src\\main\\java\\com\\filehandling\\input.txt";
        String output = "C:\\Users\\praja\\OneDrive\\Desktop\\Week04\\Day03\\src\\main\\java\\com\\filehandling\\output.txt";
        // check if the input file exists
        if (!Files.exists(Paths.get(filePath))) {
            System.out.println("Source file does not exist.");
            return;
        }
        //call the method
        readFile(filePath, output);
    }
}
