//5. Define a method that returns the product of two numbers entered by user.
package com.Assignment;

import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.print(mul(a,b));
    }
    static int mul(int a, int b){
        return a * b;
    }
}
