//7. [Number of Good Pairs](https://leetcode.com/problems/number-of-good-pairs/)
package com.Assignment3;

public class Seven {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,};
        int i = 0,count=0;
        while(i < arr.length-1){
            for(int j = i+1 ; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            i++;
        }
        System.out.println(count);
    }

}
