//2. Area Of Triangle
package com.Assignment2.Basic;

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        System.out.print("Enter breadth and height of triangle : ");
        Scanner in = new Scanner(System.in);
        float b = in.nextFloat();
        float h = in.nextFloat();
        double area = 0.5*b*h;
        System.out.print("Area of triangle : "+area);
    }
}
