package com.krupa;

import java.util.Scanner;

public class reverseOfNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = in.nextInt();
        int rev = 0;
        while(n>0){
            int last = n % 10;
            rev = rev*10 + last;
            n /= 10;
        }
        System.out.println("reverse  of "+n+" = "+ rev);
    }
}
