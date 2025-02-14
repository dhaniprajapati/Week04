package com.objectserialization;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ObjectSerialization{
    private static final String FILE_NAME = "C:\\Users\\praja\\OneDrive\\Desktop\\Week04\\Day03\\src\\main\\java\\com\\objectserialization\\employee.txt";
    //method to serialize employee list
    public static void saveEmployees(List<Employee> employees) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(employees);
            System.out.println("Employees saved successfully.");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
    //method to deserialize employee list
    public static List<Employee> loadEmployees() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            return (List<Employee>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error: " + e.getMessage());
            return new ArrayList<>();
        }
    }
    //main method
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Anshu", "HR", 50000));
        employees.add(new Employee(2, "Dhani", "IT", 60000));
        employees.add(new Employee(3, "Kanchan", "Administration", 55000));

        //serialize employees
        saveEmployees(employees);

        // Deserialize employees and display
        List<Employee> loadedEmployees = loadEmployees();
        System.out.println("Retrieved Employees:");
        for (Employee employee : loadedEmployees) {
            System.out.println(employee);
        }
    }
}

