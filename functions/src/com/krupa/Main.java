package com.krupa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*
        adding two numbers

        Scanner in = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int a = in.nextInt();
        int b = in.nextInt();
        int sum = a + b;
        System.out.print(sum);
*/
//        sum();
//        returning int value
//        System.out.print(sum2());
//        Passing argument
        String greet = greet("krupa");
        System.out.print(greet);

    }
    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int a = in.nextInt();
        int b = in.nextInt();
        int sum = a + b;
        System.out.print(sum);
    }
    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int a = in.nextInt();
        int b = in.nextInt();
        int sum = a + b;
        return sum;
    }
    static String greet(String name){
        String message = "Hello "+name;
        return message;
    }


}
