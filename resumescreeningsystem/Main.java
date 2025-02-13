package com.resumescreeningsystem;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Resume<SoftwareEngineer> seResume = new Resume<>(new SoftwareEngineer(), "Dhani", "Fresher");
        Resume<DataScientist> dsResume = new Resume<>(new DataScientist(), "Shruti", "Fresher");
        Resume<ProductManager> pmResume = new Resume<>(new ProductManager(), "Kanchan", "Fresher");

        List<JobRole> resumes = new ArrayList<>();
        resumes.add(seResume.getJobRole());
        resumes.add(dsResume.getJobRole());
        resumes.add(pmResume.getJobRole());

        ResumeProcessor processor = new ResumeProcessor();
        processor.processResumes(resumes);
    }
}
