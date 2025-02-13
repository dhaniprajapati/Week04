package com.resumescreeningsystem;

import java.util.List;

public class ResumeProcessor {
    public void processResumes(List<? extends JobRole> resumes) {
        for (JobRole jobRole : resumes) {
            System.out.println("Processing resume for: " + jobRole.getName());
        }
    }
}

