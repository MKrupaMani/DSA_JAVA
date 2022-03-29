//5. Calculate Distance Between Two Points
package com.Assignment2.Intermediate;

import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        System.out.print("Enter x and y coordinates(x1,y1,x2,y2) : ");
        Scanner in = new Scanner(System.in);
        float x1 = in.nextFloat();
        float y1 = in.nextFloat();
        float x2 = in.nextFloat();
        float y2 = in.nextFloat();
        double distance = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
        System.out.print("distance between ("+x1+","+y1+") and ("+x2+","+y2+") : "+distance);
    }
}
