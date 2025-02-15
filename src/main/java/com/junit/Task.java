package com.junit;

public class Task {
    public String longRunningTask() throws InterruptedException {
        Thread.sleep(2000);
        return "Task Completed";
    }
}
