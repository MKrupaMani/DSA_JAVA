package com.krupa;

public class FunctionOverloading {
    public static void main(String[] args) {
        demo(); //without parameters
        demo(0); //with parameters
    }
    static void demo(){
        System.out.println("without parameters");
    }
    static void demo(int a){
        System.out.print("with parameters");
    }
}
