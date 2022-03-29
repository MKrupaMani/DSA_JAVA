package com.krupa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
/*
        switch syntax
        System.out.print("Enter a fruit name : ");
        String fruit = in.next();
        switch(fruit){
            case "Mango":
                System.out.print("King of fruits");
                break;
            case "Apple":
                System.out.print("Sweet red fruit");
                break;
            case "Orange":
                System.out.print("Round fruit");
                break;
            case "Grapes":
                System.out.print("Small fruit");
                break;
            default:
                System.out.print("Enter a valid fruit name!");
         }
*/
        int day = in.nextInt();
/*
        Using switch
        switch(day){
            case 1 :
                System.out.print("Monday");
                break;
            case 2 :
                System.out.print("Tuesday");
                break;
            case 3 :
                System.out.print("Wednesday");
                break;
            case 4 :
                System.out.print("Thursday");
                break;
            case 5 :
                System.out.print("Friday");
                break;
            case 6 :
                System.out.print("Saturday");
                break;
            case 7 : System.out.print("Sunday");
        }
*/

/*
        enhanced switch
        switch (day) {
            case 1 -> System.out.print("Monday");
            case 2 -> System.out.print("Tuesday");
            case 3 -> System.out.print("Wednesday");
            case 4 -> System.out.print("Thursday");
            case 5 -> System.out.print("Friday");
            case 6 -> System.out.print("Saturday");
            case 7 -> System.out.print("Sunday");
        }
*/
/*
        switch for multiple cases with same statements
         switch(day){
            case 1,2,3,4,5 :  {System.out.print("Weekday");break;}
            case 6,7 : System.out.print("Weekend");
        }
*/
/*
        enchanced switch for multiple cases with same statements(use curly braces if there are multiple statements)
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.print("Weekday");
            case 6, 7 -> System.out.print("Weekend");
        }
*/
    }
}
