package com.annotation.practiceproblems.beginnerlevel.importantmethod;

public class TaskManager {
    @ImportantMethod(level = "HIGH")
    public void criticalTask() {
        System.out.println("Executing critical task.");
    }
    @ImportantMethod(level = "MEDIUM")
    public void regularTask() {
        System.out.println("Executing regular task.");
    }
    public void optionalTask() {
        System.out.println("Executing optional task.");
    }
}
