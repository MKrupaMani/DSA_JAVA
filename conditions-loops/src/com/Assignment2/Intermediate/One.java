//1. Factorial Program In Java
package com.Assignment2.Intermediate;

import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a value : ");
        int n = in.nextInt();
        int fact = 1;
        for(int i = n; i >= 2; i--){
            fact *= i;
        }
        System.out.print("Factorial of "+n+" = "+fact);
    }
}
