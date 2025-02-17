package com.annotation.practiceproblems.beginnerlevel.todoannotation;

public class Project {
    @ToDo(task = "", assignedTo = "Implement user authentication", priority = "HIGH")
    public void implementAuth() {
        System.out.println("User authentication pending...");
    }

    @ToDo(task = "Optimize database queries", assignedTo = "Bob", priority = "MEDIUM")
    public void optimizeDatabase() {
        System.out.println("Database optimization pending...");
    }

    @ToDo(task = "Refactor legacy code", assignedTo = "Charlie")
    public void refactorCode() {
        System.out.println("Code refactoring pending...");
    }
}
