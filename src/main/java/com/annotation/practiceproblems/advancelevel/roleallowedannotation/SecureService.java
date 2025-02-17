package com.annotation.practiceproblems.advancelevel.roleallowedannotation;

class SecureService {
    @RoleAllowed("ADMIN")
    public void adminTask() {
        System.out.println("Admin task executed successfully.");
    }
}
