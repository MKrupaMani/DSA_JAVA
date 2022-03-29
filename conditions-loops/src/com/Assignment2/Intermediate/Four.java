//4. Calculate Discount Of Product
package com.Assignment2.Intermediate;

import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        System.out.print("Enter discount : ");
        Scanner in = new Scanner(System.in);
        float discount = in.nextFloat();
        System.out.print("Enter product's price : ");
        float price = in.nextFloat();
        float discountPrice = price * (discount/100);
        System.out.print("Discount on product : "+discountPrice);

    }
}
