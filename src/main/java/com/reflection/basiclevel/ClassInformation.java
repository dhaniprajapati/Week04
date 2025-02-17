package com.reflection.basiclevel;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class ClassInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the class name: ");
        String className = scanner.nextLine();
        scanner.close();
        Class<?> cls = null;
        try {
            // attempt to load the class dynamically
            cls = Class.forName(className);
            // display class name
            System.out.println("Class: " + cls.getName());
            // display fields
            System.out.println("\nFields:");
            Field[] fields = cls.getDeclaredFields();
            // loop through all declared fields
            for (Field field : fields) {
                System.out.println(field);
            }
        } catch (ClassNotFoundException e) {
            // handle case where class is not found
            System.out.println("Class not found: " + className);
        }
        // display constructors
        System.out.println("\nConstructors:");
        Constructor<?>[] constructors = cls.getDeclaredConstructors();
        // loop through all declared constructors
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }
        // display methods
        System.out.println("\nMethods:");
        Method[] methods = cls.getDeclaredMethods();
        // loop through all declared methods
        for (Method method : methods) {
            System.out.println(method);
        }
    }
}