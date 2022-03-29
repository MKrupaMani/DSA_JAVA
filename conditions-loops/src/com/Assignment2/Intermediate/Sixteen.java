//16. Find Ncr & Npr
//nPr = n!/(n-r)!
//nCr = n!/[r! (n-r)!]
package com.Assignment2.Intermediate;

import java.util.Scanner;

public class Sixteen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n and r value : ");
        int n = in.nextInt();
        int r = in.nextInt();
        int nFact=1,rFact=1,nMinusRFact=1;
        for(int i = n; i >= 2; i--){
            nFact *= i;
        }
        for(int i = r; i >= 2; i--){
            rFact *= i;
        }
        for(int i = (n-r); i >= 2; i--){
            nMinusRFact *= i;
        }
        double npr = (nFact / nMinusRFact);
        double ncr = (nFact/(rFact * nMinusRFact));
        System.out.println(n+"P"+r+" = "+npr);
        System.out.print(n+"C"+r+" = "+ncr);
    }
}
