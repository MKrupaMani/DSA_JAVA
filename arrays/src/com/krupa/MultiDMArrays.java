package com.krupa;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDMArrays {
    public static void main(String[] args) {
//        int[][] arr = {
//                {1,2,3},
//                {4,5},
//                {6,7,8,9}
//        };
        // 1st way
//        for(int row = 0; row < arr.length; row++){
//            for(int col = 0; col < arr[row].length; col++){
//                System.out.print(arr[row][col]+"  ");
//            }
//            System.out.println();
//        }
        // second way
//        for(int row = 0; row < arr.length; row++){
//            for(int element : arr[row]){
//                System.out.print(element+"  ");
//            }
//            System.out.println();
//        }
        //sub second way
//        for(int[] row : arr){
//            for(int col : row){
//                System.out.print(col+"    ");
//            }
//            System.out.println();
//        }
        //third way
//        for(int[] array : arr){
//            System.out.println(Arrays.toString(array));
//        }

        //user input
        Scanner in = new Scanner(System.in);
        String[][] arr2 = new String[3][3];
        for(int row = 0; row < arr2.length; row++){
            for(int col = 0; col < arr2[row].length; col++){
                arr2[row][col] = in.next();
            }
        }
        for(String[] array : arr2){
            System.out.println(Arrays.toString(array));
        }
    }
}
