package com.listinterface;

import java.util.LinkedList;
import java.util.ListIterator;

public class FindNthFromEnd {
    // Method to find Nth term from end
    public static String findNthFromEnd(LinkedList<String> list,int N){
        //if list is empty or N is smallar then or equal to N
        if(list==null || N<=0){
            return null;
        }
        //list iterator to iterate from first and second pointer
        ListIterator<String> first = list.listIterator();
        ListIterator<String> second = list.listIterator();

        //run loop to move first pointer N steps ahead
        for(int i=0; i<N; i++) {
            //if first pointer does not have next, return null
            if(!first.hasNext()) {
                return null;
            }
            first.next();
        }
        //move both pointers together until first reaches the end
        while(first.hasNext()) {
            first.next();
            second.next();
        }
        return second.next();
    }
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        int N=5;
        System.out.println("Nth element from end: " + findNthFromEnd(list, N));
    }
}
