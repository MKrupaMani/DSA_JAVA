//4. [Richest Customer Wealth](https://leetcode.com/problems/richest-customer-wealth/)
package com.Assignment3;

public class Four {
    public static void main(String[] args) {
        int[][] accounts = {
                {1,2,3},
                {3,2,1}
        };
        int sum = 0;
        int max = 0;
        for(int customer = 0; customer < accounts.length; customer++){
            for(int bank = 0; bank < accounts[customer].length; bank++){
                sum += accounts[customer][bank];
            }
            max = Math.max(max,sum);
            sum = 0;
        }
        System.out.println(max);
    }
}
