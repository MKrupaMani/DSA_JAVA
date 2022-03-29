//11. Perimeter Of Rectangle
package com.Assignment2.Basic;

import java.util.Scanner;

public class Eleven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length and width : ");
        float length = in.nextFloat();
        float width = in.nextFloat();
        double p = 2*(length+width);
        System.out.print("Perimeter of Rectangle : "+p);
    }
}
