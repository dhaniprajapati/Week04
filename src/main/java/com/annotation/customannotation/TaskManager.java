package com.annotation.customannotation;

class TaskManager {
    @TaskInfo(priority = "Assignment", assignedTo = "Dhani")
    public void completeTask() {
        System.out.println("Task is being done");
    }
}
