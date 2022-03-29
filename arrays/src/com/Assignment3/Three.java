//3. [Running Sum of 1d Array](https://leetcode.com/problems/running-sum-of-1d-array/)
package com.Assignment3;

import java.util.Arrays;

public class Three {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = new int[arr1.length];
        int sum = 0;
        for(int i = 0; i < arr1.length; i++){
            sum = sum + arr1[i];
            arr2[i] = sum;

        }
        System.out.println(Arrays.toString(arr2));
    }
}
