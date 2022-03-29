package com.binarySearch.krupa;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        int target  = 4;
        int ans = agnosticBinarySearch(arr,target);
        System.out.println(ans);

    }

    static int agnosticBinarySearch(int[] arr, int target) {
        int start = 0, end = arr.length-1;
        boolean isAsc = arr[start] < arr[end];
        while(start <= end){
                int mid = start + (end - start) / 2;
                if(target == arr[mid]){
                    return mid;
                }
                if(isAsc)
                {
                    if(target < arr[mid]){
                        end = mid - 1;
                    }
                    else{
                        start = start + 1;
                    }
                }
                else{
                    if(target > arr[mid]){
                        end = mid - 1;
                    }
                    else{
                        start = start + 1;
                    }
                }
        }
        return -1;
    }
}
