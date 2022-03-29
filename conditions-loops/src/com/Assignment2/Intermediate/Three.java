//3. Calculate Average Of N Numbers
package com.Assignment2.Intermediate;

import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        System.out.println("Enter -1 to exit");
        Scanner in = new Scanner(System.in);
        float n = 0, sum = 0, count = 0, average = 0;
        while(true){
            System.out.print("Enter a number : ");
            n = in.nextFloat();
            sum += n;
            count++;
            if(n == -1){
                break;
            }
        }
        average = sum / count;
        System.out.print("Average : "+average);

    }
}
