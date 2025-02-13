package com.resumescreeningsystem;

public class Resume<T extends JobRole> {
    private T jobRole;
    private String candidateName;
    private String resumeContent;

    public Resume(T jobRole, String candidateName, String resumeContent) {
        this.jobRole = jobRole;
        this.candidateName = candidateName;
        this.resumeContent = resumeContent;
    }

    public T getJobRole() {
        return jobRole;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public String getResumeContent() {
        return resumeContent;
    }

    @Override
    public String toString() {
        return "Resume:" +
                "jobRole=" + jobRole.getName() +
                ", candidateName='" + candidateName + '\'' +
                ", resumeContent='" + resumeContent;
    }
}
