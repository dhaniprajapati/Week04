package com.uppercasetolowercase;

import java.io.*;
import static java.nio.charset.StandardCharsets.*;

public class UppercaseToLowercase {
    // Method to convert uppercase to lowercase and write to another file
    public static void convertUppercaseToLowercase(File inputFile, File outputFile) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(inputFile, UTF_8));
             BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile, UTF_8))) {
            int character;
            while ((character = br.read()) != -1) {
                bw.write(Character.toLowerCase(character));
            }
        }
    }
    // Main method
    public static void main(String[] args) {
        File inputFile = new File("C:\\Users\\praja\\OneDrive\\Desktop\\Week04\\Day03\\src\\main\\java\\com\\uppercasetolowercase\\input.txt");
        File outputFile = new File("C:\\Users\\praja\\OneDrive\\Desktop\\Week04\\Day03\\src\\main\\java\\com\\uppercasetolowercase\\output.txt");

        try {
            // Convert uppercase to lowercase and write to output file
            convertUppercaseToLowercase(inputFile, outputFile);
            System.out.println("File conversion completed successfully.");
        } catch (IOException e) {
            System.err.println("error occurred: " + e.getMessage());
        }
    }
}
