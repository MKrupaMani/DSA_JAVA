package ArrayQuestions;

import java.util.ArrayList;

public class SearchingAllIndexWithoutPassingListAsArg {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,5};
        System.out.println(searchAll(arr,4,0));
    }

    static ArrayList<Integer> searchAll(int[] arr,int target, int index){
        ArrayList<Integer> li = new ArrayList<>();
        if(index == arr.length){
            return li;
        }

        //this will contain answer for that function call only
        if(arr[index] == target){
            li.add(index);
        }
        ArrayList<Integer> answerFromCurrentCall = searchAll(arr,target,index+1);
        li.addAll(answerFromCurrentCall);
        return li;
    }
}
