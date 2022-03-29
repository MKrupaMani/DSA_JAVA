package com.krupa;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        if(n==0){
            System.out.print(a);
            return;
        }
        if(n==1){
            System.out.print(b);
            return;
        }
        int sum=a+b;
        if(n>1){
            for(int i = 3; i <= n; i++){
                a = b;
                b = sum;
                sum = a+b;
            }
            System.out.println(n+"th element = "+sum);
        }

    }
}
