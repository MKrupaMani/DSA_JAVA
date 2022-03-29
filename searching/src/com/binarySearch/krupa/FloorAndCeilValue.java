package com.binarySearch.krupa;

import java.util.Arrays;

public class FloorAndCeilValue {
    public static void main(String[] args){
        int[] arr = {2,3,5,9,14,16,18};
        int target = 19;
        System.out.println(Arrays.toString(floorAndCeil(arr,target)));
    }
    static int[] floorAndCeil(int[] arr, int target){

        int start = 0, end = arr.length - 1;
//        if(target > arr[arr.length - 1]){
//            start = -1;
//        }
//        if(target < arr[0]){
//            end = -1;
//        }
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                return new int[] {arr[mid]};
            }
            else if(target < arr[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        if(start > arr.length - 1){
            start = -1;
        }
        return new int[] {end,start};
    }
}
