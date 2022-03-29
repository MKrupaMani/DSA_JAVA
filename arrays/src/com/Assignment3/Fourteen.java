//14. [Cells with Odd Values in a Matrix](https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/)
package com.Assignment3;

public class Fourteen {
    public static void main(String[] args) {
        int m = 2;
        int n = 3;
        int[][] indices = {{0,1},{1,1}};
        int[][] matrix = new int[m][n];
        for(int[] arr : indices){
            int a = arr[0];
            int b = arr[1];
            for(int i = 0; i < n ; i++){
                matrix[a][i] += 1;
            }
            for(int i = 0 ; i < m; i++){
                matrix[i][b] += 1;
            }
        }
        int odd = 0;
        for(int[] arr : matrix){
            for(int ele : arr){
                if(ele%2==1){
                    odd++;
                }
            }
        }
        System.out.println(odd);
    }
}
