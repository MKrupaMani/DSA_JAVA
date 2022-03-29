//12. [Find the Highest Altitude](https://leetcode.com/problems/find-the-highest-altitude/)
package com.Assignment3;

public class Twelve {
    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
        int highest = 0,sum =0;
        for(int i = 0; i < gain.length; i++){
            sum += gain[i];
            highest = Math.max(highest,sum);
        }
        System.out.println(highest);
    }

}
