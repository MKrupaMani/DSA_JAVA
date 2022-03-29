package com.krupa;
import java.lang.System;
import java.util.Scanner;

public class conditionals {

    public static void main(String[] args) {
	// write your code here
        System.out.print("enter your salary : ");
        Scanner in = new Scanner(System.in);
        int salary = in.nextInt();
        if(salary < 10000){
            salary += 1000; // salary = salary+1000
        }
        else if(salary < 20000){
            salary += 2000;
        }
        else{
            salary += 3000;
        }
        System.out.println("Your salary is "+salary);
    }
}
