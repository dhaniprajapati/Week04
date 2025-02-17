package com.annotation.practiceproblems.beginnerlevel.importantmethod;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
    Method[] methods = TaskManager.class.getDeclaredMethods();

    for (Method method : methods) {
        if (method.isAnnotationPresent(ImportantMethod.class)) {
            ImportantMethod annotation = method.getAnnotation(ImportantMethod.class);
            System.out.println("Method: " + method.getName() + " | Importance Level: " + annotation.level());
        }
    }
}
}