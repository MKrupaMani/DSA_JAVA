//4. Write a program to print the sum of two numbers entered by user by defining your own method.
package com.Assignment;

import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int a = in.nextInt();
        int b = in.nextInt();
        add(a,b);
    }
    static void add(int a, int b){
        System.out.print(a+b);
    }
}
