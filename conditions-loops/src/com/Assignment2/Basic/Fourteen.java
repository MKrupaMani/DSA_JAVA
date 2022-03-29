//14. Volume Of Cone Java Program
package com.Assignment2.Basic;

import java.util.Scanner;

public class Fourteen {
    public static void main(String[] args) {
        System.out.print("Enter radius and height of cone : ");
        Scanner in = new Scanner(System.in);
        float rad = in.nextFloat();
        float height = in.nextFloat();
        double vol = 3.14*Math.pow(rad,2)*height/3;
        System.out.print("Volume of cone : "+vol);
    }
}
