//5. Area Of Parallelogram
package com.Assignment2.Basic;

import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter base and height of Parallelogram : ");
        float b = in.nextFloat();
        float h = in.nextFloat();
        double area = Math.round(b*h);
        System.out.print("Area of Parallelogram : "+area);
    }
}
