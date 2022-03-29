//13. Perimeter Of Rhombus
package com.Assignment2.Basic;

import java.util.Scanner;

public class Thirteen {
    public static void main(String[] args) {
        System.out.print("Enter length of side in a rhombus : ");
        Scanner in = new Scanner(System.in);
        float a = in.nextFloat();
        double p = 4 * a;
        System.out.print("Perimeter of Rhombus : "+p);

    }

}
