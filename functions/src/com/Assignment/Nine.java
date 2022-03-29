/*
9. Write a program to print the factorial of a number by defining a method named 'Factorial'.
        Factorial of any number n is represented by n! and is equal to 1*2*3*....*(n-1)*n. E.g.-
        4! = 1*2*3*4 = 24
        3! = 3*2*1 = 6
        2! = 2*1 = 2
        Also,
        1! = 1
        0! = 0
*/
package com.Assignment;

import java.util.Scanner;

public class Nine {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = in.nextInt();
        System.out.print(Factorial(n));
    }

    private static int Factorial(int n) {
        int fact = 1;
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        if(n >= 2){
            for(int i = 2; i <= n; i++){
                fact *= i;
            }

        }
        return fact;
    }
}
