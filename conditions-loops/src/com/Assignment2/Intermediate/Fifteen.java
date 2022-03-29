//15. Armstrong Number In Java
package com.Assignment2.Intermediate;

import java.util.Scanner;

public class Fifteen {
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arm = 0,a = n;
        while(n > 0){
            int lastDigit = n % 10;
            arm += Math.pow(lastDigit,3);
            n /= 10;
        }
        if(arm == a){
            System.out.print(a+" is Armstrong Number");
        }
        else{
            System.out.print(a+" is not Armstrong Number");
        }
    }
}
