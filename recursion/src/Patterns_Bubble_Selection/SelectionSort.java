package Patterns_Bubble_Selection;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        selection(arr, arr.length - 1, 1, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr, int r, int c, int max){
        if(r == 1){
            return;
        }
        if(c <= r){
            if(arr[max] < arr[c]){
                max = c;
            }
            selection(arr, r, c + 1, max);
        }
        else{
            int temp = arr[max];
            arr[max] = arr[r];
            arr[r] = temp;
            selection(arr, r - 1, 1, 0);
        }
    }
}
