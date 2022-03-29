package com.krupa;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int pos = bs(arr, 45,0,arr.length - 1);
        System.out.println(pos);
    }
    static int bs(int[] arr, int target, int start, int end){
        if(start > end){
            return -1;
        }
        int mid = start + (end - start) / 2;
        if(arr[mid] == target){
            return mid;
        }
        else if(arr[mid] < target){
            return bs(arr, target, mid + 1, end);
        }
        else {
            return bs(arr, target, start, mid - 1);
        }
    }
}
