//6. Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
package com.Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Six {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius of a circle : ");
        float rad = in.nextFloat();
        System.out.println("Area : "+area(rad));
        System.out.print("Circumference : "+peri(rad));
    }

    private static double peri(float rad) {
        return 2*3.14*rad;
    }

    static double area(float rad){
        return 3.14*rad*rad;
    }
}
