//5. [Shuffle the Array](https://leetcode.com/problems/shuffle-the-array/)
package com.Assignment3;

import java.util.Arrays;

public class Five {
    public static void main(String[] args) {
        int[] arr1 = {2,5,1,3,4,7};
        int n = arr1.length/2;
        int[] arr2 = new int[2*n];
        int count = 0;
        for(int i = 0; i < n; i++){
             arr2[count] = arr1[i];
             arr2[count+1] = arr1[i+n];
             count+=2;
        }
        System.out.println(Arrays.toString(arr2));

    }
}
