package com.krupa;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        demo(10,50,"krupa","vijju","mani"); // order matters
    }
    static void demo(int a ,int b,String ...v){
        int sum = a+b;
        System.out.println(sum);
        System.out.print(Arrays.toString(v));

    }
}
