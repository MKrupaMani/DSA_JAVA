package ArrayQuestions;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(linearSearching(arr,0,0));
    }

    static int linearSearching(int[] arr, int i,int target){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == target){
            return i;
        }
        else {
            return linearSearching(arr, i + 1, target);
        }
    }
}
