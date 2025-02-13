package com.universitycoursemanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Course<T extends CourseType> {
    private List<T> courses;

    public Course() {
        courses = new ArrayList<>();
    }

    public void addCourse(T course) {
        courses.add(course);
    }

    public List<T> getCourses() {
        return courses;
    }

    public void printCourseDetails() {
        for (T course : courses) {
            System.out.println("Course Name: " + course.getCourseName() + ", Evaluation Type: " + course.getEvaluationType());
        }
    }
}
