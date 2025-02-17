package com.annotation.practiceproblems.advancelevel.customcachingsystem;

public class Main {
    public static void main(String[] args) {
        Computation computation = new ExpensiveComputation();
        // Create a proxy with caching functionality for the interface
        Computation proxy = (Computation) CachingHandler.createProxy(computation);
        // First call will compute and cache the result
        System.out.println(proxy.compute(2, 3));
        // Second call will return the cached result without computing
        System.out.println(proxy.compute(2, 3));
    }
}
