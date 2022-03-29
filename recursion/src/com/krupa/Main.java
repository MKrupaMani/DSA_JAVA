package com.krupa;

public class Main {
    public static void main(String[] args) {
        // print hello world five times
        message();
    }

    static void message(){
        System.out.println("krupa");
        message2();
    }

    private static void message2() {
        System.out.println("krupa");
        message3();
    }

    private static void message3() {
        System.out.println("krupa");
        message4();
    }

    private static void message4() {
        System.out.println("krupa");
        message5();
    }

    private static void message5() {
        System.out.println("krupa");
    }
}
