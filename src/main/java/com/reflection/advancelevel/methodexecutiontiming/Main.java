package com.reflection.advancelevel.methodexecutiontiming;

public class Main {
    public static void main(String[] args) {
        //create object
        Time time = new Time();
        //call method
        MethodTimer.measureExecutionTime(time);
    }
}

