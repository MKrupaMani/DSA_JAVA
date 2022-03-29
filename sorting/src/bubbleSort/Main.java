package bubbleSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int[] arr = {10,30,-20,-15,25,0, -1000, 500, 200, -2000,7};
        int[] arr1 = {1,2,3,4,5};
        System.out.println(Arrays.toString(bubbleSort(arr1)));
    }

    static int[] bubbleSort(int[] arr){
        boolean isSwapped = false;
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 1; j < arr.length - i; j++){
                if(arr[j] < arr[j - 1]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    isSwapped = true;
                }
            }
            if(!isSwapped){
                break;
            }
        }
        return arr;
    }
}
