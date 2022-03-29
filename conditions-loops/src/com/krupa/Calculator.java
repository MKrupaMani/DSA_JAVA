package com.krupa;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res = 0;
        System.out.println("Enter x or X to exit ");
        while(true){
            System.out.print("Enter an operator : ");
            char ch = in.next().trim().charAt(0);
            if(ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%'){
                System.out.print("Enter two operands : ");
                int n1 = in.nextInt();
                int n2 = in.nextInt();
                if(ch == '+'){
                    res = n1 + n2;
                    System.out.println(res);
                }
                else if (ch == '-'){
                    res = n1 - n2;
                    System.out.println(res);
                }
                else if (ch == '*'){
                    res = n1 * n2;
                    System.out.println(res);
                }
                else if (ch == '/'){
                    if(n2 != 0){
                    res = n1 / n2;
                    System.out.println(res);
                    }
                    else{
                        System.out.println("Denominator should not equal to 0");
                    }
                }
                else{
                    res = n1 % n2;
                    System.out.println(res);
                }

            }
            else if ( ch == 'x' || ch =='X'){
                System.out.println("Thank you so much for using our calculator 😍");
                break;
            }
            else{
                System.out.println("Kindly enter a valid operator !!! 😊");
            }

        }
    }
}
