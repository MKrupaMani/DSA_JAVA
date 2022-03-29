//15. Volume Of Prism
// Volume of Prism = Base area * height
package com.Assignment2.Basic;

import java.util.Scanner;

public class Fifteen {
    public static void main(String[] args) {
        System.out.println("Enter base area and height of prism : ");
        Scanner in = new Scanner(System.in);
        float b = in.nextFloat();
        float h = in.nextFloat();
        double vol = b*h;
        System.out.print("Volume of prism : "+vol);
    }
}
