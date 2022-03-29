package com.krupa;

import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListEx {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>(5);
        while(true){
            int n = in.nextInt();
            if(n==-1){
                break;
            }
            arr.add(n);
        }
        System.out.println(arr);
    }
}
