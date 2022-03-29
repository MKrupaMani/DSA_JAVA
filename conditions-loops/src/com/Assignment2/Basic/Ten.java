//10. Perimeter Of Parallelogram
package com.Assignment2.Basic;

import java.util.Scanner;

public class Ten {
    public static void main(String[] args) {
        System.out.print("Enter side and base of a parallelogram : ");
        Scanner in = new Scanner(System.in);
        float a = in.nextFloat();
        float b = in.nextFloat();
        double peri = 2*(a+b);
        System.out.print("Perimeter of Parallelogram : "+peri);
    }
}
