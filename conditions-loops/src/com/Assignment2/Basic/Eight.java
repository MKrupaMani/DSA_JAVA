//8. Perimeter Of Circle
package com.Assignment2.Basic;

import java.util.Scanner;

public class Eight {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius of a circle : ");
        float rad = in.nextFloat();
        double circum = 2*3.15*rad;
        System.out.print("Perimeter of a circle : "+circum);
    }
}
