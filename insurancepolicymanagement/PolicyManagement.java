package com.insurancepolicymanagement;

import java.util.*;

public class PolicyManagement {
    // Using different types of maps for different purposes
    private Map<String, Policy> hashMap = new HashMap<>();
    private Map<String, Policy> linkedHashMap = new LinkedHashMap<>();
    private Map<Date, Policy> treeMap = new TreeMap<>();
    // Method to add a policy to all maps
    public void addPolicy(Policy policy) {
        hashMap.put(policy.getPolicyNumber(), policy);
        linkedHashMap.put(policy.getPolicyNumber(), policy);
        treeMap.put(policy.getExpiryDate(), policy);
    }
    // Retrieve a policy by its number
    public Policy getPolicyByNumber(String policyNumber) {
        return hashMap.get(policyNumber);
    }
    // List all policies expiring within the next 30 days
    public List<Policy> getPoliciesExpiringSoon() {
        List<Policy> expiringPolicies = new ArrayList<>();
        Date now = new Date();
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_YEAR, 30);
        Date soon = cal.getTime();

        for (Map.Entry<Date, Policy> entry : treeMap.entrySet()) {
            if (entry.getKey().after(now) && entry.getKey().before(soon)) {
                expiringPolicies.add(entry.getValue());
            }
        }
        return expiringPolicies;
    }
    // List all policies for a specific policyholder
    public List<Policy> getPoliciesByPolicyholder(String policyholderName) {
        List<Policy> policiesByHolder = new ArrayList<>();
        for (Policy policy : hashMap.values()) {
            if (policy.getPolicyholderName().equalsIgnoreCase(policyholderName)) {
                policiesByHolder.add(policy);
            }
        }
        return policiesByHolder;
    }
    // Remove policies that are expired
    public void removeExpiredPolicies() {
        Date now = new Date();
        Iterator<Map.Entry<Date, Policy>> iterator = treeMap.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<Date, Policy> entry = iterator.next();
            if (entry.getKey().before(now)) {
                String policyNumber = entry.getValue().getPolicyNumber();
                iterator.remove();
                hashMap.remove(policyNumber);
                linkedHashMap.remove(policyNumber);
            }
        }
    }
    public static void main(String[] args) {
        PolicyManagement pm = new PolicyManagement();

        // Add sample policies
        pm.addPolicy(new Policy("P001", "Anjali", new Date(2025 - 1900, Calendar.MARCH, 1), "Health", 5000));
        pm.addPolicy(new Policy("P002", "Yasmine", new Date(2025 - 1900, Calendar.FEBRUARY, 20), "Auto", 3000));
        pm.addPolicy(new Policy("P003", "Vishal", new Date(2025 - 1900, Calendar.MARCH, 10), "Home", 7000));

        // Retrieve and display a policy by its number
        System.out.println("Policy P001: " + pm.getPolicyByNumber("P001"));

        // List and display policies expiring within the next 30 days
        System.out.println("Policies Expiring Soon: " + pm.getPoliciesExpiringSoon());

        // List and display policies for a specific policyholder
        System.out.println("Policies for Anjali: " + pm.getPoliciesByPolicyholder("Anjali"));

        // Remove and display policies that are expired
        pm.removeExpiredPolicies();
        System.out.println("All Policies After Removing Expired: " + pm.hashMap.values());
    }
}

