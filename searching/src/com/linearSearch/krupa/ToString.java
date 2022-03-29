package com.linearSearch.krupa;

public class ToString {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        String str = "[ ";
        for(int i = 0; i < arr.length-1; i++){
            str += arr[i]+" ,";
        }
        str += arr[arr.length-1]+" ]";
        System.out.println(str);
    }
}
