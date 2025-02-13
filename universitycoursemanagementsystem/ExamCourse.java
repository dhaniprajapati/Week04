package com.universitycoursemanagementsystem;

public class ExamCourse extends CourseType {

    public ExamCourse(String courseName) {
        super(courseName);
    }

    @Override
    public String getEvaluationType() {
        return "Exam-Based";
    }
}
