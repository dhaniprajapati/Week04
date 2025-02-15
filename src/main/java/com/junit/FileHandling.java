package com.junit;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileHandling {
    // writes content to the specified file
    public void writeToFile(String filename, String content) throws IOException {
        FileWriter writer = new FileWriter(filename);
        writer.write(content);
        writer.close();
    }
    // reads content from the specified file
    public String readFromFile(String filename) throws IOException {
        return new String(Files.readAllBytes(Paths.get(filename)));
    }
    public static void main(String[] args) {
        FileHandling fileHandling = new FileHandling();
        String filename = "C:\\Users\\praja\\OneDrive\\Desktop\\Week04\\Day05\\src\\main\\java\\com\\junit\\text.txt";
        String contentToWrite = "Hello, world!";

        try {
            // Write content to the file
            fileHandling.writeToFile(filename, contentToWrite);
            System.out.println("Content written to file successfully.");

            // Read content from the file
            String contentRead = fileHandling.readFromFile(filename);
            System.out.println("Content read from file: " + contentRead);
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}


