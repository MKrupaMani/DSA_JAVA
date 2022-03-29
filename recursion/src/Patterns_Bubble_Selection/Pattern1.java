package Patterns_Bubble_Selection;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
//        fun(n);
        fun1(n,0);
    }

    static void fun(int n){
        if(n == 0){
            return;
        }
        for(int i = 0; i < n; i++){
            System.out.print("* ");
        }
        System.out.print("\n");
        fun(n - 1);
    }

    static void fun1(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            System.out.print("* ");
            fun1(r, c+1);
        } else{
            System.out.println();
            fun1(r-1, 0);
    }
    }
}
