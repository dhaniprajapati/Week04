package com.queueinterface;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class ReverseQueue {
    public static void reverseQueue(Queue<Integer> queue) {
        //if the queue is empty
        if (queue.isEmpty()) {
            return;
        }
        //Remove top element
        int top = queue.remove();
        //recursively reverse the queue
        reverseQueue(queue);
        //add the removed element back at the end
        queue.add(top);
    }
    public static void main(String[] args) {
        Queue<Integer> queue= new ArrayDeque<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        //call the method and print result
        reverseQueue(queue);
        System.out.println("Reversed Queue: " + queue);
    }
}
