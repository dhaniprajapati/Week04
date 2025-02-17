package com.reflection.basiclevel;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;

class Student {
    private String name;
    public Student() {
        this.name = "Dhani Prajapati";
    }
    public void display() {
        System.out.println("Student Name: " + name);
    }
}
public class CreateObjects {
    public static void main(String[] args) throws Exception {
        // dynamically create an instance of Student
        Class<?> studentClass = Student.class;
        Constructor<?> constructor = studentClass.getDeclaredConstructor();
        // allow access to private constructor
        constructor.setAccessible(true);
        // create new instance of student
        Object studentObject = constructor.newInstance();
        // invoke the display method
        Method displayMethod = studentClass.getMethod("display");
        displayMethod.invoke(studentObject);
    }
}
