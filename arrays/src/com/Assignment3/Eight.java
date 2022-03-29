//8. [How Many Numbers Are Smaller Than the Current Number](https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/)
package com.Assignment3;

import java.util.Arrays;

public class Eight {
    public static void main(String[] args) {
        int[] arr1 = {8,1,2,2,3};
        int[] arr2 = new int[arr1.length];
        int i = 0,count = 0;
        while(i < arr1.length){
            for(int j = 0; j < arr1.length; j++){
                if(arr1[j] < arr1[i]){
                    count++;
                }
            }
            arr2[i] = count;
            i++;
            count = 0;
        }
        System.out.println(Arrays.toString(arr2));
    }
}
