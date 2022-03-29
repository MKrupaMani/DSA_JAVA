package com.krupa;

import java.util.Scanner;
import java.lang.System;

public class CountOfANum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = in.nextInt();
        System.out.print("Enter a digit you want to count : ");
        int d = in.nextInt();
        int count = 0;
        while(n>0){
            int last = n%10;
            if(last == d){
                count++;
            }
            n /= 10;
        }
        System.out.print("count of "+d+" in "+n+" = "+count);

    }

}
