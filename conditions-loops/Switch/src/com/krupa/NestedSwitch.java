package com.krupa;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name : ");
//        String name = in.nextLine();
        System.out.print("Enter your ID : ");
//        String id = in.next();
/*
        switch(name){
            case "krupa":
                System.out.print("Krupa");
                break;
            case "shiny":
                System.out.print("Shiny");
                break;
            case "shanthi":
                System.out.println("Shanthi");
                switch (id){
                    case "S160243":
                        System.out.print("You are studying in RGUKT");
                        break;
                    case "AN130243":
                        System.out.print("You are studying in Adikavi Nanaya university");
                }
                break;
            default:
                System.out.print("Name isn't matched");
        }
    }
*/
        /*
Enhanced nested Switch
        switch (name) {
            case "krupa" -> System.out.print("Krupa");
            case "shiny" -> System.out.print("Shiny");
            case "shanthi" -> {
                System.out.println("Shanthi");
                switch (id) {
                    case "S160243" -> System.out.print("You are studying in RGUKT");
                    case "AN130243" -> System.out.print("You are studying in Adikavi Nanaya university");
                }
            }
            default -> System.out.print("Name isn't matched");
        }
*/

    }
}
