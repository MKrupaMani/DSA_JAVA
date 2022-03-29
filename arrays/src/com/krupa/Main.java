package com.krupa;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //first way
//        String[] array = {"krupa","mani","molli"};
//        System.out.print(Arrays.toString(array));

        //taking array input from user
        Scanner in = new Scanner(System.in);
//        int[] arr; // declaration of an array
//        arr = new int[5]; // creating memory for array of objects inside heap
//        for(int i = 0; i < arr.length; i++){ //iterating through array
//            arr[i] = in.nextInt(); // creating objects inside heap
//        }
//        for(int object : arr){ // enhanced for loop
//            System.out.print(object+"    "); // printing elements of an array
//        }

        //enter your friends names
        System.out.print("Enter your friends names : ");
        String[] arr2 = new String[5];
        for(int i = 0; i < arr2.length; i++){
            arr2[i] = in.next();
        }
        System.out.println(Arrays.toString(arr2));

    }
}
