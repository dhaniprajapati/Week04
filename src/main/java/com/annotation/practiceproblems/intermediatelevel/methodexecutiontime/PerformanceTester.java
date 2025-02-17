package com.annotation.practiceproblems.intermediatelevel.methodexecutiontime;

public class PerformanceTester {
    @LogExecutionTime
    public void fastMethod() {
        long startTime = System.nanoTime();
        System.out.println("Executing fast method...");
        long endTime = System.nanoTime();
        System.out.println("Execution Time: " + (endTime - startTime) + " nanoseconds");
    }

    @LogExecutionTime
    public void slowMethod() {
        long startTime = System.nanoTime();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Executing slow method...");
        long endTime = System.nanoTime();
        System.out.println("Execution Time: " + (endTime - startTime) + " nanoseconds");
    }
}
