package com.queueinterface;

import java.util.*;

public class GenerateBinaryNumbers {
    public static List<String> generateBinaryNumbers(int N){
        List<String> result = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();
        // add 1 as the starting binary number
        queue.add("1");
        // iterate n times to generate binary numbers
        for (int i=0; i<N; i++){
            // remove the front element from the queue
            String binary=queue.remove();
            // store the removed binary number
            result.add(binary);
            // generate next binary numbers by appending 0 and 1
            queue.add(binary + "0");
            queue.add(binary + "1");
        }
        return result;
    }
    public static void main(String[] args) {
        int N = 9;
        // print the first n binary numbers
        System.out.println("Binary Numbers: " + generateBinaryNumbers(N));
    }
}

