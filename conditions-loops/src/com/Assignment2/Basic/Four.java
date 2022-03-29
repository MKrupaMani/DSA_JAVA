//4. Area Of Isosceles Triangle
//Formula = b/2 root(a^2 - b^2/4)
package com.Assignment2.Basic;

import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        System.out.print("Enter three sides of a triangle : ");
        Scanner in = new Scanner(System.in);
        float n1 = in.nextInt();
        float n2 = in.nextInt();
        float n3 = in.nextInt();
        float a=0,b=0;
        if(n1==n2){
            a = n1;
            b = n3;
        }
        else if(n1 == n3){
            a = n1;
            b = n2;
        }
        else if(n2 == n3){
            a = n2;
            b = n1;
        }
        else{
            System.out.print("Not an Isosceles Triangle ");
            return;
        }
        double area = (b/2)*Math.pow((Math.pow(a,2)-(Math.pow(b,2)/4)),0.5);
        System.out.print("Area of an Isosceles Triangle : "+area+" cm.sq");
    }
}
