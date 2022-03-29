package com.krupa;

public class NumbersRecursion {
    public static void main(String[] args) {
        print(1);
    }

    static void print(int n){
        // base condition
        if(n > 4){
            return;
        }
        // body of function
        System.out.println(n);
        // recursive call : function calling itself
        print(n + 1);
    }
}
