package com.linearSearch.krupa;

public class MaxIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {30,20,10},
                {2,3,4,1},
                {99,11},
                {100,900,0,55,23}
        };
        System.out.println(max(arr));
    }
    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for(int[] row : arr){
            for(int element : row){
                if(max < element){
                    max = element;
                }
            }
        }
        return max;
    }
}
