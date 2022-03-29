package com.krupa;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        System.out.println("Enter -1 to exit ");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = in.nextInt();
        while(n!=-1){
            isPrime(n);
            System.out.print("Enter a number : ");
            n=in.nextInt();
        }

    }
    static void isPrime(int n){
        int i;
        if(n < 2){
            System.out.println("enter a number >= 2");
            return;
        }
        for(i = 2; i*i < n; i++){
            if(n % i == 0){
                System.out.println(n+" is not Prime");
                return;
            }
        }
        System.out.println(n+" is Prime");
    }
}
