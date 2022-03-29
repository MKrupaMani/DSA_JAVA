package com.krupa;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;

public class Swap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no.of elements : ");
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
//        System.out.print("Enter indexes to swap : ");
//        swap(arr,in.nextInt(),in.nextInt());
//        System.out.println(Arrays.toString(arr));
        System.out.println(max(arr));
    }
    static void swap(int[] arr,int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    static int max(int[] arr){
        int maxi = -2090909987;
        for (int j : arr) {
            maxi = Math.max(maxi, j);
        }
        return maxi;
    }
}
