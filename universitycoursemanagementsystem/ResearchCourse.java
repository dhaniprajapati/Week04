package com.universitycoursemanagementsystem;

public class ResearchCourse extends CourseType {

    public ResearchCourse(String courseName) {
        super(courseName);
    }

    @Override
    public String getEvaluationType() {
        return "Research-Based";
    }
}
