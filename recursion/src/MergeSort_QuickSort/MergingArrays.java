package MergeSort_QuickSort;

import java.util.Arrays;

public class MergingArrays {
    public static void main(String[] args) {
        int[] arr1 = {3,5,9, 10 ,12};
        int[] arr2 = {4,6,8};
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
        System.out.println(Arrays.toString(arr3));

    }
}
