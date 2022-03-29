package com.krupa;

public class Shadowing {
    static int a;
    public static void main(String[] args) {
        System.out.print(a);
        a = 50; // static variable will be updated
        System.out.print(a);
        int a=100;  // overrides static variable. Shadowing starts soon after some local variable is declared with same name
        shadow();
        System.out.print(a);
    }
    static void shadow(){
        System.out.print(a); // accesses static variable
    }
}
