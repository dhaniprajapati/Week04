package com.annotation.practiceproblems.advancelevel.roleallowedannotation;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {
        User currentUser = new User("USER");
        SecureService service = new SecureService();
        Method method = SecureService.class.getMethod("adminTask");
        if (method.isAnnotationPresent(RoleAllowed.class)) {
            RoleAllowed annotation = method.getAnnotation(RoleAllowed.class);
            if (annotation.value().equals(currentUser.getRole())) {
                method.invoke(service);
            } else {
                System.out.println("Access Denied!");
            }
        }
    }
}
