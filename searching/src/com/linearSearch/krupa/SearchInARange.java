package com.linearSearch.krupa;

public class SearchInARange {
    public static void main(String[] args) {
        int[] arr = {18,12,-7,3,14,28};
        int target = 14, start = 1, end = 4;
        System.out.println(search(arr,target,start,end));
    }
    static boolean search(int[] arr,int target,int start,int end){
        if(arr.length == 0){
            return false;
        }
        if(start > end){
            return false;
        }
        for(int i = start; i <= end; i++){
            if(arr[i] == target){
                return true;
            }
        }
        return false;
    }
}
