//3. A person is elligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is elligible to vote.
package com.Assignment;

import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = in.nextInt();
        isEligible(age);
    }

    private static void isEligible(int age) {
        if(age >= 18){
            System.out.print("Yes you are eligible to vote");
        }
        else{
            System.out.print("sorry! You are not yet eligible to vote");
        }
    }
}
