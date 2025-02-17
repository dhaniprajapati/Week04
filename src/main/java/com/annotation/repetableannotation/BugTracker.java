package com.annotation.repetableannotation;

public class BugTracker {
    @BugReport(description = "Null pointer exception occurs in edge cases")
    @BugReport(description = "Incorrect calculation in boundary conditions")
    public void processTask() {
        System.out.println("Processing task...");
    }
}
