//23. Perfect Number In Java
package com.Assignment2.Intermediate;

import java.util.Scanner;

public class TwentyThree {
    public static void main(String[] args) {
        System.out.print("Enter number : ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        for(int i = 1; i < n; i++){
            if(n % i ==0){
                sum += i;
            }
        }
        if(sum == n){
            System.out.print(n+" is a perfect number");
        }
        else{
            System.out.print(n+" is not a perfect number");
        }
    }
}
