package com.queueinterface;

import java.util.*;

class StackUsingQueues {
    Queue<Integer> queue1 = new LinkedList<>();
    Queue<Integer> queue2 = new LinkedList<>();

    // push an element onto the stack
    public void push(int x) {
        // add the element to queue1
        queue1.add(x);
    }

    // remove and return the top element from the stack
    public int pop() {
        if (queue1.isEmpty()) {
            System.out.println("stack is empty");
        }
        // move elements to queue2 keeping only the last one in queue1
        while (queue1.size() > 1) {
            queue2.add(queue1.remove());
        }
        // remove the last element which is the top of the stack
        int topElement = queue1.remove();
        // swap queue1 and queue2
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
        return topElement;
    }

    // return the top element without removing it
    public int top() {
        if (queue1.isEmpty()) {
            System.out.println("stack is empty");
        }
        // move elements to queue2 keeping only the last one in queue1
        while (queue1.size() > 1) {
            queue2.add(queue1.remove());
        }
        // get the last element which is the top of the stack
        int topElement = queue1.peek();
        // move it to queue2
        queue2.add(queue1.remove());
        // swap queue1 and queue2
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;

        return topElement;
    }

    // check if the stack is empty
    public boolean isEmpty() {
        return queue1.isEmpty();
    }
    public static void main(String[] args) {
        StackUsingQueues stack = new StackUsingQueues();
        // push elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Pop: " + stack.pop());
        System.out.println("Top: " + stack.top());
    }
}
