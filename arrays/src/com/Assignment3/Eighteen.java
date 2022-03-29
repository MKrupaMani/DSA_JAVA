//18. [Add to Array-Form of Integer](https://leetcode.com/problems/add-to-array-form-of-integer/)
package com.Assignment3;

import java.util.ArrayList;

public class Eighteen {
    public static void main(String[] args){
        int[] num = {9,9,9,9,9,9,9,9,9,9};
        ArrayList<Integer> num1 = new ArrayList<>(5);
        int k = 1;
        for (int j : num) {
            num1.add(j);
        }
        int rm = 0;
        int last = num1.size()-1;
        while(rm != 0){
            if(last == -1 && rm != 0){
                num1.add(0,rm);
            }
            int lastIndex = k % 10;
            k /= 10;
            rm = rm + lastIndex + num1.get(last);
            if(rm >= 10){
                num1.set(last, rm % 10);
                rm /= 10;
                last--;
                continue;
            }
            num1.add(last , lastIndex);
        }
        if(rm > 0){
            rm = rm + num1.get(last);
            num1.set(last,rm % 10);
            rm /= 10;
            num1.add(0,rm);
        }
        System.out.println(num1);
    }
}
