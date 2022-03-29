//9. [Create Target Array in the Given Order](https://leetcode.com/problems/create-target-array-in-the-given-order/)
package com.Assignment3;

import java.util.ArrayList;
import java.util.Arrays;

public class Nine {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,0};
        int[] index = {0,1,2,3,0};
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i = 0; i < index.length; i++) {
            al.add(index[i], nums[i]);
        }
        int[] target = al.stream().mapToInt(i -> i).toArray();
        System.out.println(Arrays.toString(target));
    }
}
