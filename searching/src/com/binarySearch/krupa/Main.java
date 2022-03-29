package com.binarySearch.krupa;

public class Main {
    public static void main(String[] args) {
        int[] arr = {-400,-250,-50,-9,-3,0,3,9,50,250,400};
        int target = 0;
        System.out.println(binarySearch(arr,target));
    }
    static int binarySearch(int[] arr,int target){
        int start = 0, end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target == arr[mid]){
                return mid;
            }
            else if(target < arr[mid]){
                end = mid - 1;
            }
            else{
                start = start + 1;
            }
        }
        return -1;
    }
}
