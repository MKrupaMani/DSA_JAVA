package insertionSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {-100,0,-50,20,15,1,3,2,-10};
        for(int i = 0; i < arr.length - 1 ; i++){
            for(int j = i + 1; j > 0; j--){
                if(arr[j] > arr[j - 1]){
                    break;
                }
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
