package com.arif;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 2, 9, 45};
//        swap(arr, 0, 2);
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    //reverse the array
    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while (start < end) {
            //call swap
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }
}
