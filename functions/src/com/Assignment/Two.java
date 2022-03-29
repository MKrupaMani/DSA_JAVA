//2. Define a program to find out whether a given number is even or odd.
package com.Assignment;

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = in.nextInt();
        evenOdd(a);
    }

    private static void evenOdd(int a) {
        if(a % 2 == 0){
            System.out.print(a+" is even");
        }
        else{
            System.out.print(a+" is odd");
        }
    }
}
