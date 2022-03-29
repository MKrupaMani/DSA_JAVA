package ArrayQuestions;

import java.util.ArrayList;

public class LinearSearchingForEveryIndex {
    static ArrayList<Integer> li = new ArrayList<>();
    public static void main(String[] args) {
        int[] arr = {1,22,4,5,2,5};

        ArrayList<Integer> li = search(arr,0,5);
        System.out.println(li);
    }

//    private static void search(int[] arr,ArrayList<Integer> li2, int i, int target) {
//        if(i == arr.length){
//            return;
//        }
//        if(arr[i] == target){
//            li2.add(i);
//        }
//        search(arr,li2,i+1,target);
//    }

    private static ArrayList<Integer> search(int[] arr, int i, int target) {
        if(i == arr.length){
            return li;
        }
        if(arr[i] == target){
            li.add(i);
        }
        return search(arr,i+1,target);
    }
}
