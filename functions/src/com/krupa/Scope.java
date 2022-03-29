//1)Cannot redeclare variables inside block but we can update them
package com.krupa;

import static java.lang.Long.sum;

public class Scope {
    static String name="krupa";
    public static void main(String[] args){
        int a,b=20;
        String name = "mani";
        System.out.println(name);
        if(true){
            a = 10;// we can assign values
            name = "kunal"; // we can update values
            System.out.println(name);

        }
        System.out.println(name);
        add(a,b);
        System.out.println(name);
    }

    private static void add(int a, int b) {
        System.out.println(name);
        name = "Kushagra";
        System.out.println(name);
        String name = "Atharva";
        System.out.println(name);
    }
}
