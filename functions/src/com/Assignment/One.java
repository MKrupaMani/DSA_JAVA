//1. Define two methods to print the maximum and the minimum number respectively among three numbers entered by user.
package com.Assignment;

import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 3 numbers : ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        max(a,b,c);
        min(a,b,c);
    }

    private static void min(int a, int b, int c) {
        System.out.println("Minimum : "+Math.min(Math.min(a,b),c));
    }

    static void max(int a , int b, int c){
        System.out.println("Maximum : "+Math.max(Math.max(a,b),c));
    }
}
