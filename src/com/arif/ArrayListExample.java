package com.arif;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
//        list.add(23);
//        list.add(65);
//        list.add(89);
//        list.add(6);
//        list.set(0,99);
//        list.remove(1);
//        System.out.println(list.contains(72));
//        System.out.println(list);
        // taking input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        //get item at any index
        for (int i = 0; i < 5; i++) {
        }
        System.out.println(list.get(1));

//        System.out.println(list);
    }
}
