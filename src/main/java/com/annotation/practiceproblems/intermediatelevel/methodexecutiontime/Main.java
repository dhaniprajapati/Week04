package com.annotation.practiceproblems.intermediatelevel.methodexecutiontime;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {
        PerformanceTester tester = new PerformanceTester();
        Method[] methods = PerformanceTester.class.getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(LogExecutionTime.class)) {
                method.invoke(tester);
            }
        }
    }
}
