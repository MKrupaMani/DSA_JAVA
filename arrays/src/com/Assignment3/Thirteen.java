//13. [Flipping an Image](https://leetcode.com/problems/flipping-an-image/)
package com.Assignment3;

import java.util.Arrays;

public class Thirteen {
    public static void main(String[] args) {
        int[][] image = {
                {1,1,0},
                {1,0,1},
                {0,0,0}
        };
        for(int[] arr : image){
            int i = 0, j = arr.length-1;
            while(i<j){
                if(arr[i] == 0 && arr[j] == 0){
                    arr[i] = 1;
                    arr[j] = 1;
                }
                else if(arr[i] == 1 && arr[j] == 1){
                    arr[i] = 0;
                    arr[j] = 0;
                }
                i++;
                j--;
            }
            if(i == j){
                if(arr[i] == 0){
                    arr[i] = 1;
                }
                else{
                    arr[i] = 0;
                }
            }

        }
        for(int[] arr : image){
        System.out.println(Arrays.toString(arr));
    }}
}
