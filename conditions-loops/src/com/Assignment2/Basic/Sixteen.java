//16. Volume Of Cylinder
package com.Assignment2.Basic;

import java.util.Scanner;

public class Sixteen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius and height of Cylinder : ");
        float rad = in.nextFloat();
        float height = in.nextFloat();
        double vol = 3.14*Math.pow(rad,2)*height;
        System.out.print("Volume of cylinder : "+vol);
    }
}
