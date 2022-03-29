//17. Volume Of Sphere
package com.Assignment2.Basic;

import java.util.Scanner;

public class Seventeen {
    public static void main(String[] args) {
        System.out.print("Enter radius of the sphere : ");
        Scanner in = new Scanner(System.in);
        float rad = in.nextFloat();
        double vol = (1.333) * 3.14 * Math.pow(rad,3);
        System.out.print("Volume of Sphere : "+vol);
    }
}
