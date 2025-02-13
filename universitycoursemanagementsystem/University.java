package com.universitycoursemanagementsystem;


import java.util.ArrayList;
import java.util.List;

public class University {
    public static void printAllCourses(
            List<? extends CourseType> courses) {
        for (CourseType course : courses) {
            System.out.println("Course Name: " + course.getCourseName() + ", Evaluation Type: " + course.getEvaluationType());
        }
    }

    public static void main(String[] args) {
        List<CourseType> allCourses = new ArrayList<>();
        allCourses.add(new ExamCourse("Math"));
        allCourses.add(new AssignmentCourse("English"));
        allCourses.add(new ResearchCourse("Science"));

        printAllCourses(allCourses);
    }
}

