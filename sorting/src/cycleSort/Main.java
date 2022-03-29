package cycleSort;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4};
        int i = 0;
        while(i < arr.length){
            if(arr[i] == i + 1){
                i++;
            }
            else{
                int temp1 = arr[i];
                arr[i] = arr[temp1 - 1];
                arr[temp1 - 1] = temp1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}