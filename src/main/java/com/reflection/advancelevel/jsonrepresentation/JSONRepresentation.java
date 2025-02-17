package com.reflection.advancelevel.jsonrepresentation;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

class Person {
    private String name;
    private int age;
    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // Getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
public class JSONRepresentation {
    public static void main(String[] args) {
        //create object of person class
        Person person = new Person("John", 30);
        //create ObjectMapper instance
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            //serialize the person object to JSON string
            String jsonString = objectMapper.writeValueAsString(person);
            System.out.println("Serialized JSON: " + jsonString);
        } catch (IOException e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
}
