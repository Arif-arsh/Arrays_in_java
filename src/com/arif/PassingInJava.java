package com.arif;

import java.util.Arrays;
import java.util.EnumSet;

public class PassingInJava {

    public static void main(String[] args) {
        int [] nums = {1,2,4,5};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] arr) {

        arr[0] = 99;
    }
}
