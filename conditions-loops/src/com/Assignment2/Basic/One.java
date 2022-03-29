//1. Area Of Circle Java Program
package com.Assignment2.Basic;

import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        float pi = 3.14f;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius : ");
        float rad = in.nextFloat();
        double area = pi*Math.pow(rad,2);
        System.out.print("Area of Circle : "+area);
    }
}
