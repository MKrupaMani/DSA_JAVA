//2. [Concatenation of Array](https://leetcode.com/problems/concatenation-of-array/)
package com.Assignment3;

import java.util.Arrays;

public class Two {
    public static void main(String[] args) {
        int[] arr1 = {1,2,1};
        int[] arr2 = new int[arr1.length*2];
        for(int i = 0; i < arr1.length; i++){
            arr2[i] = arr1[i];
            arr2[i+arr1.length] = arr1[i];
        }
        System.out.println(Arrays.toString(arr2));
    }
}
