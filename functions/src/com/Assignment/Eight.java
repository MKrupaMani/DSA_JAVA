/*
8. Write a program which will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
        Marks        Grade
        91-100         AA
        81-90          AB
        71-80          BB
        61-70          BC
        51-60          CD
        41-50          DD
        <=40          Fail
*/
package com.Assignment;

import java.util.Scanner;

public class Eight {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your marks : ");
        int marks = in.nextInt();
        System.out.print(grade(marks));
    }

    private static String grade(int marks) {
        String grade;
        if(91 <= marks && marks <= 100){
            grade = "AA";
        }
        else if(81 <= marks && marks <= 90){
            grade = "AB";
        }
        else if(71 <= marks && marks <= 80){
            grade = "BB";
        }
        else if(61 <= marks && marks <= 70){
            grade = "BC";
        }
        else if(51 <= marks && marks <= 60){
            grade = "CD";
        }
        else if(41 <= marks && marks <= 50){
            grade = "DD";
        }
        else{
            grade = "Fail";
        }
        return grade;
    }

}
