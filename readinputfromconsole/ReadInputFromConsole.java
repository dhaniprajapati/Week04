package com.readinputfromconsole;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadInputFromConsole {
    public static void main(String[] args) {
        // create BufferedReader object for console input
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            // ask user for details
            System.out.print("Enter your name: ");
            String name = reader.readLine();

            System.out.print("Enter your age: ");
            String age = reader.readLine();

            System.out.print("Enter your favorite programming language: ");
            String favLang = reader.readLine();

            // create FileWriter object to write data into a file
            FileWriter writer = new FileWriter("C:\\Users\\praja\\OneDrive\\Desktop\\Week04\\Day03\\src\\main\\java\\com\\readinputfromconsole\\output");
            writer.write("Name: " + name + ", ");
            writer.write("Age: " + age + ", ");
            writer.write("Favorite Programming Language: " + favLang );
            writer.flush();
            writer.close();

            System.out.println("User data successfully saved to output file.");

        } catch (IOException e) {
            //catch IOExceptions and print message
            System.out.println("Error: " + e.getMessage());
        }
    }
}
