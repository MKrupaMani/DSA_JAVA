package com.krupa;

import java.util.Arrays;
import java.util.Scanner;

public class PassByValue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a and b : ");
        int a = in.nextInt();
        int b = in.nextInt();
        swap(a,b);

        int[] arr = {10,20,40,50,100};
        changeValue(arr);
        System.out.print(Arrays.toString(arr));
    }
    static void swap(int a,int b){
        System.out.println("Before swapping : "+a+" "+b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping : "+a+" "+b); 
    }
    static void changeValue(int[] arr2){
        arr2[2] = 30;
        arr2[3] = 40;
        arr2[4] = 50;
    }
}
