package com.largefilereading;


import java.io.*;

public class LargeFileReading {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\praja\\OneDrive\\Desktop\\Week04\\Day03\\src\\main\\java\\com\\largefilereading\\100mb-examplefile-com.txt";
        //try and catch block
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.toLowerCase().contains("example")) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
