package com.annotation.practiceproblems.beginnerlevel.todoannotation;

import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {
        Method[] methods = Project.class.getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(ToDo.class)) {
                ToDo annotation = method.getAnnotation(ToDo.class);
                System.out.println("Task: " + annotation.task() + " | Assigned To: " + annotation.assignedTo() + " | Priority: " + annotation.priority());
            }
        }
    }
}
