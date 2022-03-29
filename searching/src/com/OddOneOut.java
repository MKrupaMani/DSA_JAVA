package com;
//import java.util.Scanner;

public class OddOneOut {
    public static void main(String[] args) {
/*
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] str = new String[n];
        for(int i = 0; i < n; i++){
            str[i] = in.nextLine();
        }
*/
        String[] str = {"abcd","bcde","efgh","dcbe"};
        String odd = "";
        int firstPos = str[0].charAt(0);
        int secondPos = str[0].charAt(1);
        int temp1 = secondPos - firstPos;
        int count = 0;
        for(int i = 1; i < str.length; i++){
            firstPos = str[i].charAt(0);
            secondPos = str[i].charAt(1);
            int temp2 = secondPos - firstPos;
            if(temp1 == temp2) {
                count++;
                continue;
            }
            else{

            }

        }
        System.out.println(odd);
    }
}
