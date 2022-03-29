//16. [Find Numbers with Even Number of Digits](https://leetcode.com/problems/find-numbers-with-even-number-of-digits/)
package com.Assignment3;

public class Sixteen {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896,23,34243,908,243143};
        int count=0;
        for(int num : nums){
            int temp = 0;
            while(num > 0){
                temp++;
                num /= 10;
            }
            if(temp%2==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
