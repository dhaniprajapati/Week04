package com.annotation.practiceproblems.intermediatelevel.maxlengthannotation;

import java.lang.reflect.Field;

public class User {
    @MaxLength(10)
    private String username;

    public User(String username) {
        if (!isValid(username)) {
            throw new IllegalArgumentException("Username exceeds maximum length of 10 characters");
        }
        this.username = username;
    }
    private boolean isValid(String value) {
        try {
            Field field = this.getClass().getDeclaredField("username");
            if (field.isAnnotationPresent(MaxLength.class)) {
                MaxLength annotation = field.getAnnotation(MaxLength.class);
                return value.length() <= annotation.value();
            }
        } catch (NoSuchFieldException e) {
            System.out.println(e.getMessage());
        }
        return true;
    }
}
