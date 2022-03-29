package com.krupa;

import java.util.Arrays;
import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 3 numbers : ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

/*
        if(a > b){
            if(a > c){
                System.out.println(a+" is tha largest value");
            }
            else{
                System.out.println(c+" is tha largest value");
            }
        }
        else{
            if(b > c){
                System.out.println(b+" is tha largest value");

            }
            else{
                System.out.println(c+" is tha largest value");
            }

        }
*/
/*
        int max = a;
        if(max < b){
            max = b;
        }
        if(max < c){
            max = c;
        }
        System.out.println("max = " + max);
*/
        int max = Math.max(Math.max(a,b),c);
        System.out.println("max = " + max);
    }
}
