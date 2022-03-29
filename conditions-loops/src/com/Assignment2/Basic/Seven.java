//7. Area Of Equilateral Triangle
package com.Assignment2.Basic;

import java.util.Scanner;

public class Seven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter side of an equilateral Triangle : ");
        float a = in.nextFloat();
        double area  = (Math.pow(3,0.5)/4)*Math.pow(a,2);
        System.out.print("Area of Equilateral Triangle : "+area);
    }
}
