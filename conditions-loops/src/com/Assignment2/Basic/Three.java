//3. Area Of Rectangle Program
package com.Assignment2.Basic;

import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        System.out.print("Enter length and width of rectangle : ");
        Scanner in = new Scanner(System.in);
        float l = in.nextFloat();
        float w = in.nextFloat();
        double area = l*w;
        System.out.print("Area of rectangle : "+area);
    }
}
