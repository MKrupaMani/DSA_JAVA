//1. [Build Array from Permutation](https://leetcode.com/problems/build-array-from-permutation/)
package com.Assignment3;

import java.util.Arrays;

public class One {
    public static void main(String[] args) {
        int[] arr = {0,2,1,5,3,4};
        int[] arr2 = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            arr2[i] = arr[arr[i]];
        }
        System.out.println(Arrays.toString(arr2));
    }
}
