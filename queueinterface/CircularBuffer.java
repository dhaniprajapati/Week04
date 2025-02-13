package com.queueinterface;

import java.util.Arrays;

class CircularBuffer {
    private int[] buffer;
    private int head;
    private int tail;
    private int size;
    private int capacity;

    // constructor to initialize the buffer
    public CircularBuffer(int capacity) {
        this.capacity = capacity;
        this.buffer = new int[capacity];
        this.head = 0;
        this.tail = 0;
        this.size = 0;
    }
    // insert an element into the buffer
    public void insert(int value) {
        // add the new value at the tail position
        buffer[tail] = value;
        // move the tail pointer forward
        tail = (tail + 1) % capacity;
        // if the buffer is full move the head forward
        if (size == capacity) {
            head = (head + 1) % capacity;
        } else {
            size++;
        }
    }
    // get the current buffer elements in order
    public int[] getBuffer() {
        int[] result = new int[size];
        // copy elements from head to tail
        for (int i = 0; i < size; i++) {
            result[i] = buffer[(head + i) % capacity];
        }
        return result;
    }
    public static void main(String[] args) {
        // create a circular buffer with capacity 3
        CircularBuffer cb = new CircularBuffer(3);
        // insert elements into the buffer
        cb.insert(1);
        cb.insert(2);
        cb.insert(3);
        System.out.println("Buffer: " + Arrays.toString(cb.getBuffer()));
        cb.insert(4);
        System.out.println("Buffer: " + Arrays.toString(cb.getBuffer())); // output: [2, 3, 4]
    }
}

