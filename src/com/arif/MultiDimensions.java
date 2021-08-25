package com.arif;

import javax.swing.*;
import java.util.Scanner;

public class MultiDimensions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];
        //taking input
        for (int row = 0; row < arr.length; row++) {
            //for each column in the row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();

            }
        }

        //output
        for (int row = 0; row < arr.length; row++) {
            //for each column in the row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
                System.out.print(arr[row][col] + " ");

            }
            System.out.println();
        }

    }

}
