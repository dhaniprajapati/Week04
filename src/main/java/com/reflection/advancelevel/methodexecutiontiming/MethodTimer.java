package com.reflection.advancelevel.methodexecutiontiming;
import java.lang.reflect.Method;

public class MethodTimer {
    public static void measureExecutionTime(Object obj) {
        Class<?> cls = obj.getClass();
        //create method object
        Method[] methods = cls.getDeclaredMethods();
        //loop to calculate time for each method
        for (Method method : methods) {
            if (method.isAnnotationPresent(Timed.class)) {
                try {
                    System.out.println("Executing: " + method.getName());
                    long startTime = System.nanoTime();
                    method.invoke(obj);
                    long endTime = System.nanoTime();
                    long duration = (endTime - startTime) / 1000000;
                    System.out.println("Execution time of " + method.getName() + ": " + duration + " ms\n");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
