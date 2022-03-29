//6. Area Of Rhombus
package com.Assignment2.Basic;

import java.util.Scanner;

public class Six {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the diagonals of a rhombus : ");
        float d1 = in.nextFloat();
        float d2 = in.nextFloat();
        double area = (d1*d2)/2;
        System.out.print("Area of Rhombus : "+area);
    }
}
