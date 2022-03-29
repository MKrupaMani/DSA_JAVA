package com.linearSearch.krupa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {10,20,25,15,19,40,100};
        System.out.print("enter element to search in the array : ");
        int x = in.nextInt();
        linearSearch(arr,x);
    }
    static void linearSearch(int[] arr,int x){
        for(int i = 0 ; i < arr.length; i++){
            if (x == arr[i]){
                System.out.println("Element found at index "+i);
                return;
            }
        }
        System.out.println("Element not found!!!");

    }
}
