package com.annotation.practiceproblems.advancelevel.customcachingsystem;

public class ExpensiveComputation implements Computation {
    @Override
    @CacheResult
    public int compute(int a, int b) {
        System.out.println("Computing...");
        try {
            // Simulating an expensive computation
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return a + b;
    }
}
