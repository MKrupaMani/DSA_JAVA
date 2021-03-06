package MergeSort_QuickSort;

import java.util.Arrays;
import java.util.Scanner;

public class InPlaceMergeSort {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int[] arr = new int[n];

//        for (int i = 0; i < n; i++) {
//            arr[i] = in.nextInt();
//        }
        int[] arr = {5,4,3,2,1};
        mergeSortInPlace(arr, 0 , arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSortInPlace(int[] arr, int s, int e){
        if(e - s == 1){
            return;
        }
        int m = s + (e - s) / 2;
        mergeSortInPlace(arr, s, m);
        mergeSortInPlace(arr, m, e);

        merge(arr, s, m, e);
    }

    static void merge(int[] arr, int s, int m, int e){
        int i = s, j = m, k = 0;
        int[] mix = new int[e - s];
        while(i < m && j < e){
            if(arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            }
            else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i < m){
            mix[k] = arr[i];
            i++;
            k++;
        }
        while(j < e){
            mix[k] = arr[j];
            j++;
            k++;
        }

        for(int l = 0; l < mix.length; l++){
            arr[s + l] = mix[l];
        }
    }
}
