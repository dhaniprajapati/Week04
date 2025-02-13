package com.votingsystem;

import java.util.*;

class VotingSystem {

    // hashmap to store the votes for each candidate
    private Map<String, Integer> hashMapVotes = new HashMap<>();

    // treemap to store results sorted by votes and candidate names
    private Map<String, Integer> treeMapResults = new TreeMap<>((a, b) -> {
        // first, compare the votes in descending order
        int comparison = Integer.compare(hashMapVotes.get(b), hashMapVotes.get(a));
        // if votes are equal, compare by name alphabetically
        if (comparison == 0) {
            return a.compareTo(b); 
        }
        return comparison;
    });

    // linkedhashmap to maintain the order of votes cast
    private Map<String, Integer> linkedHashMapOrder = new LinkedHashMap<>();

    // method to cast a vote for a candidate
    public void castVote(String candidate) {
        // increment the vote count for the candidate in the hashmap
        hashMapVotes.put(candidate, hashMapVotes.getOrDefault(candidate, 0) + 1);

        // update the linkedhashmap to maintain the order of votes
        linkedHashMapOrder.put(candidate, linkedHashMapOrder.getOrDefault(candidate, 0) + 1);

        // refresh the results in the treemap
        refreshResults();
    }
    // method to refresh the results in the treemap based on the latest vote counts
    private void refreshResults() {
        // clear the current treemap and update with the latest votes
        treeMapResults.clear();
        treeMapResults.putAll(hashMapVotes);
    }
    // method to display the voting results sorted by votes
    public void displayResults() {
        System.out.println("voting results (sorted by votes):");
        for (Map.Entry<String, Integer> entry : treeMapResults.entrySet()) {
            System.out.println("candidate: " + entry.getKey() + " | votes: " + entry.getValue());
        }
    }
    // method to display the order in which votes were cast
    public void displayVoteOrder() {
        System.out.println("order of votes cast:");
        for (Map.Entry<String, Integer> entry : linkedHashMapOrder.entrySet()) {
            System.out.println("candidate: " + entry.getKey() + " | votes: " + entry.getValue());
        }
    }
    public static void main(String[] args) {
        VotingSystem votingSystem = new VotingSystem();
        votingSystem.castVote("anshu");
        votingSystem.castVote("bibek");
        votingSystem.castVote("ankit");
        votingSystem.castVote("chanchal");
        votingSystem.castVote("dhani");
        votingSystem.castVote("anshu");
        votingSystem.displayResults();
        votingSystem.displayVoteOrder();
    }
}
