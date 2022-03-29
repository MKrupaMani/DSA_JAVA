package MergeSort_QuickSort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        int[] answer = mergeSort(arr);
        System.out.println(Arrays.toString(answer));
    }

    static int[] mergeSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    static int[] merge(int[] arr1, int[] arr2){
        int[] arr3 = new int[arr1.length + arr2.length];
        int a1 = 0, b1 = 0;
        for(int i = 0; i < arr3.length; i++){
            if(b1 == arr2.length && a1 != arr1.length){
                arr3[i] = arr1[a1];
                a1++;
            }
            else if(a1 == arr1.length && b1 != arr2.length){
                arr3[i] = arr2[b1];
                b1++;
            }
            else if(arr1[a1] < arr2[b1]){
                arr3[i] = arr1[a1];
                a1++;
            }
            else{
                arr3[i] = arr2[b1];
                b1++;
            }
        }
        return arr3;

    }
}
