package com.binarySearch.krupa;

public class PositionOfAnElementInInfiniteSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 5;
        System.out.println(findChunk(arr,target));
    }
    static int binarySearch(int[] arr,int target,int start,int end){
        while(start<=end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                return mid;
            }
            else if(target < arr[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
    static int findChunk(int[] arr,int target){
        int start = 0,end=1;
        while(target>arr[end]){
            int newStart = end + 1;
            end = end + (end - start + 1)*2;
            start = newStart;
        }
        int ans = binarySearch(arr,target,start,end);
        return ans;
    }
}
