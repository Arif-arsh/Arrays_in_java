package com.arif;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int[] nums = new int[5];
//        nums[0] = 35;
//        nums[1] = 40;
//        nums[2] = 45;
//        nums[3] = 55;
//        nums[4] = 65;
//        System.out.println(nums[3]);


//        for (int i = 0; i < nums.length; i++) {
//            nums[i] = in.nextInt();
//        }
//        System.out.print(Arrays.toString(nums));



        String[] name = new String[4];
        for (int i = 0; i < name.length; i++) {
            name[i] = in.next();
        }
//        System.out.print(Arrays.toString(name));
        //modify
        name[0] = "Arif";
        System.out.print(Arrays.toString(name));


    }
}
