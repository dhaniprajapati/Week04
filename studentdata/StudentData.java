package com.studentdata;

import java.io.*;
public class StudentData {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\praja\\OneDrive\\Desktop\\Week04\\Day03\\src\\main\\java\\com\\studentdata\\input.txt";

        //write student details to a binary file
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {
            dos.writeInt(007);
            dos.writeUTF("Dhani Prajapati");
            dos.writeDouble(7.57);

            System.out.println("Student data saved successfully");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }

        //read student details from the binary file
        try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
            int rollNumber = dis.readInt();
            String name = dis.readUTF();
            double gpa = dis.readDouble();

            System.out.println("Retrieved Student Data:");
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("GPA: " + gpa);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}