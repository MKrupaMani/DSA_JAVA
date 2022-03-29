//7. Define a method to find out if number is prime or not.
package com.Assignment;

import java.util.Scanner;

public class Seven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = in.nextInt();
        System.out.print(isPrime(n));
    }

    private static boolean isPrime(int n) {
        for(int i = 2; i <= n/2; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
