package com.listinterface;

import java.util.ArrayList;
import java.util.List;

public class RotateList {
    //method to rotate list
    public static  List<Integer> rotate(List<Integer> list, int positions) {
        int size= list.size();
        List<Integer> rotatedList = new ArrayList<>(size);
        //run loop to rotate the loop from the position
        for (int i=0; i<size; i++){
            int position= (i+positions)%size;
            int value= list.get(position);
            rotatedList.add(value);
        }
        //return result
        return rotatedList;
    }
    public static void main(String[] args) {
        List<Integer> inputList = List.of(10, 20, 30, 40, 50);
        int positions = 3;
        //call the method and print result
        List<Integer> rotatedList = rotate(inputList, positions);
        System.out.println(rotatedList);
    }
}

