//6. [Kids With the Greatest Number of Candies](https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/)
package com.Assignment3;

import java.util.ArrayList;
import java.util.List;

public class Six {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        ArrayList<Boolean> candies2 = new ArrayList<>(7);
        int extra = 3;
        int i = 0;
        while(i < candies.length){
            int total = candies[i]+extra;
            int j = 0;
            for(j = 0; j < candies.length; j++){
                if(candies[j]>total){
                    candies2.add(false);
                    break;
                }
            }
            if(j == candies.length){
                candies2.add(true);
            }
            i++;
        }
        System.out.println(candies2);
    }
}
