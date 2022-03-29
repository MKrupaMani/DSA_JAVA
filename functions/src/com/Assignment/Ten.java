//10. Write a function to find if a number if palindrome or not. Take number as parameter.
package com.Assignment;

import java.util.Scanner;

public class Ten {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = in.nextInt();
        ifPal(n);
    }

    private static void ifPal(int n) {
        int rev=0,a = n;
        while(n > 0){
            int lastIndex = n % 10;
            rev = rev * 10 + lastIndex;
            n /= 10;
        }
        if(rev == a){
            System.out.print("Palindrome");
        }
        else{
            System.out.print("Not a palindrome");
        }
    }
}
