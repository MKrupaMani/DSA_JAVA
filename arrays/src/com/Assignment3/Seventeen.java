//17. [Transpose Matrix](https://leetcode.com/problems/transpose-matrix/)
package com.Assignment3;

import java.util.Arrays;

public class Seventeen {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6}
        };
        int[][] transpose = new int[matrix[0].length][matrix.length];
        for(int i = 0; i < matrix[0].length; i++){
            for(int j = 0; j < matrix.length; j++){
                transpose[i][j] = matrix[j][i];
            }
        }
        for(int[] array : transpose){
            System.out.println(Arrays.toString(array));
        }
    }
}
