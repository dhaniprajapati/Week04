package com.queueinterface;

import java.util.*;

class Patient {
    String name;
    int severity;
    // constructor to initialize patient details
    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }
}
public class HospitalTriageSystem {
    public static void main(String[] args) {
        // create a priority queue
        PriorityQueue<Patient> queue = new PriorityQueue<>((p1, p2) -> Integer.compare(p2.severity, p1.severity));

        // add patients to the queue
        queue.add(new Patient("John", 3));
        queue.add(new Patient("Alice", 5));
        queue.add(new Patient("Bob", 2));

        // process patients based on severity
        System.out.println("Order of treatment:");
        while (!queue.isEmpty()) {
            // remove the patient with the highest severity
            Patient patient = queue.poll();
            System.out.println(patient.name);
        }
    }
}

