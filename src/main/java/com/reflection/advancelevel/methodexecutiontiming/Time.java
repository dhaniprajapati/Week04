package com.reflection.advancelevel.methodexecutiontiming;

public class Time {
    //method to measure execution time
    @Timed
    public void fastMethod() {
        System.out.println("Fast method executing...");
    }
    @Timed
    public void slowMethod() {
        System.out.println("Slow method executing...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
    public void normalMethod() {
        System.out.println("Normal method.");
    }
}
