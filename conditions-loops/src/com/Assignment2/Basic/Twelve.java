//12. Perimeter Of Square
package com.Assignment2.Basic;

import java.util.Scanner;

public class Twelve {
    public static void main(String[] args) {
        System.out.print("Enter a side : ");
        Scanner in = new Scanner(System.in);
        float n = in.nextFloat();
        double p = 4*n;
        System.out.print("Perimeter of Square : "+p);
    }
}
