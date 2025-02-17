package com.annotation.practiceproblems.intermediatelevel.maxlengthannotation;

public class Main {
    public static void main(String[] args) {
        try {
            User user1 = new User("dhani06");
            System.out.println("User1 created successfully");

            User user2 = new User("dhaniprajapati06");
            System.out.println("User2 created successfully");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
