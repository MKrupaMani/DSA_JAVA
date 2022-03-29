//7. Power In Java
package com.Assignment2.Intermediate;

import java.util.Scanner;

public class Seven {
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        Scanner in = new Scanner(System.in);
        float n = in.nextFloat();
        System.out.print("Enter power : ");
        float pow = in.nextFloat();
        double power = Math.pow(n,pow);
        System.out.print(n+" to the power of "+pow+" is "+power);

    }
}
