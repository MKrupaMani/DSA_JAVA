//15. [Matrix Diagonal Sum](https://leetcode.com/problems/matrix-diagonal-sum/)
package com.Assignment3;

public class Fifteen {
    public static void main(String[] args) {
        int[][] mat = {
                {5}
        };
        int a = mat.length-1;
        int b = mat[0].length-1;
        int diag = 0;
        for(int i = 0; i <= a; i++){
            diag += mat[i][i];

        }
        int j = a;
        for(int i = 0; i <= b ; i++){
            if(i==j){
                j--;
                continue;
            }
            diag += mat[j][i];
            j--;
        }
        System.out.print(diag+"    ");


    }
}
