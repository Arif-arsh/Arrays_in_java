package com.arif;

import java.util.Arrays;

public class ArraySyntax {
    public static void main(String[] args) {
        //Q:store 5 roll no.
//        int[] rnos = {23, 5, 3, 6, 2};
//        System.out.println(Arrays.toString(rnos));
        String[] arr = new String[4];
        System.out.println(arr[0]);
    }
}
// syntax
// datatype[] variable_name = new datatype[size];
// int[] rnos; ->declaration of array. rnos is getting defined in the stack
// rnos = new int[5]; ->initialization: actually here object is being created in the memory (heap)
