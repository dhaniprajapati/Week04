package com.efficientfilecopy;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;

public class EfficientFileCopy {

    // method to copy file using normal file streams
    public static void copyFile(String filePath, String output) {
        long startTime = System.nanoTime();
        try (FileInputStream fis = new FileInputStream(filePath);
             FileOutputStream fos = new FileOutputStream(output)) {
            // buffer array to store data
            byte[] buffer = new byte[1024];
            // variable to store the length of data read
            int length;
            // reading the input file and writing it to the destination
            while ((length = fis.read(buffer)) > 0) {
                fos.write(buffer, 0, length);
            }
            System.out.println("File contents successfully copied to destination file.");
        } catch (IOException e) {
            // catching any IOExceptions and printing the error message
            System.out.println("Error: " + e.getMessage());
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Performance of normal file stream: " + duration);
    }

    // method to copy file using buffered file streams
    public static void copyFileUsingBuffer(String filePath, String output) {
        long startTime = System.nanoTime();
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filePath));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(output))) {
            byte[] buffer = new byte[4096];
            // variable to store the length of data read
            int length;
            // reading the input file and writing it to the destination
            while ((length = bis.read(buffer)) > 0) {
                bos.write(buffer, 0, length);
            }
            System.out.println("File contents successfully copied to destination file.");
        } catch (IOException e) {
            // catching any IOExceptions and printing the error message
            System.out.println("Error: " + e.getMessage());
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Performance of buffered file stream: " + duration);
    }

    public static void main(String[] args) {
        String filePath= "C:\\Users\\praja\\OneDrive\\Desktop\\Week04\\Day03\\src\\main\\java\\com\\efficientfilecopy\\100mb-examplefile-com.txt";
        String output= "C:\\Users\\praja\\OneDrive\\Desktop\\Week04\\Day03\\src\\main\\java\\com\\efficientfilecopy\\output.txt";
        copyFile(filePath,output);
        copyFileUsingBuffer(filePath,output);
    }
}
