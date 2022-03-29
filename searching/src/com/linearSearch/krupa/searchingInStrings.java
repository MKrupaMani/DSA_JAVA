package com.linearSearch.krupa;

public class searchingInStrings {
    public static void main(String[] args) {
        String str = "krupa mani molli";
        char target = 'u';
        System.out.println(search(str,target));
    }
    static boolean search(String str,char target){
        if(str.length() == 0){
            return false;
        }
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == target){
                return true;
            }
        }
        return false;
    }
    static boolean search2(String str,char target){
        if(str.length() == 0){
            return false;
        }
        for (char element: str.toCharArray()){
            if (element == target) {
                return true;
            }
        }
        return false;
    }

}
