package com.krupa;

import java.util.Scanner;
public class Upperlowercase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a character : ");
        char ch = in.next().trim().charAt(0);
        if (ch >= 'a' && ch <= 'z'){
            System.out.println(ch+" is lower case letter");
        }
        else if(ch >= 'A' && ch <= 'Z'){
            System.out.println(ch+" is upper case letter");
        }
        else{
            System.out.println("enter a valid letter");
        }


    }


}
