package com.reflection.basiclevel;
import java.lang.reflect.Field;

class Person {
    private int age;
    public Person(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
}
public class AccessPrivateField {
    public static void main(String[] args) {
        try {
            Person person = new Person(25);
            // get the private field "age"
            Field ageField = Person.class.getDeclaredField("age");
            // make the field accessible
            ageField.setAccessible(true);
            // retrieve and print the value
            int ageValue = (int) ageField.get(person);
            System.out.println("Original age: " + ageValue);
            // modify the value
            ageField.set(person, 30);
            // retrieve and print the modified value
            System.out.println("Modified age: " + person.getAge());
        } catch (NoSuchFieldException | IllegalAccessException e) {
            System.out.println("Error: "+ e.getMessage());
        }
    }
}
