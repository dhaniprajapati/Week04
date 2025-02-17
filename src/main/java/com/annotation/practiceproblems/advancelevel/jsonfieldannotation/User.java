package com.annotation.practiceproblems.advancelevel.jsonfieldannotation;

public class User {
    @JsonField(name = "user_name")
    private String username;

    @JsonField(name = "full_name")
    private String fullName;

    @JsonField(name = "email_address")
    private String email;

    public User(String username, String fullName, String email) {
        this.username = username;
        this.fullName = fullName;
        this.email = email;
    }

    // Getters
    public String getUsername() {
        return username;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }
}
