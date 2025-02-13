package com.mapinterface;

import java.util.*;

class Employee {
    private String name;
    private String department;
    // constructor
    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }
    // getters
    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return name;
    }
}
public class GroupObjects {
    public static Map<String, List<Employee>> groupByDepartment(List<Employee> employees) {
        Map<String, List<Employee>> departmentMap = new HashMap<>();
        // iterate through the employee list and group by department
        for (Employee emp : employees) {
            departmentMap.computeIfAbsent(emp.getDepartment(), k -> new ArrayList<>()).add(emp);
        }
        return departmentMap;
    }
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Carol", "HR")
        );
        Map<String, List<Employee>> grouped = groupByDepartment(employees);
        System.out.println(grouped);
    }
}
