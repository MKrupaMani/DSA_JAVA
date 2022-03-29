//9. Perimeter Of Equilateral Triangle
package com.Assignment2.Basic;

import java.util.Scanner;

public class Nine {
    public static void main(String[] args) {
        System.out.print("Enter side of an equilateral triangle : ");
        Scanner in = new Scanner(System.in);
        float a = in.nextFloat();
        double peri = 3*a;
        System.out.print("Perimeter of an equilateral triangle : "+peri);
    }
}
