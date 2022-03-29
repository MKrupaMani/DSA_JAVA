package selectionSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {-1,30,-20,50,-300,500,150};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }

    private static int[] selectionSort(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++ ){
            int maxPos = 0, last = arr.length - i - 1;
            for(int j = 1; j <= last; j++){
                if(arr[j] > arr[maxPos]){
                    maxPos = j;
                }
            }
            int temp = arr[last];
            arr[last] = arr[maxPos];
            arr[maxPos] = temp;
        }
        return arr;
    }
}
