package com.krupa;

public class Palindrome {
    public static void main(String[] args) {
        String word = "";
        int last = word.length() - 1;
        int i = 0;
        boolean isPalindrome = true;
        while(i < last){
            if(word.charAt(i) == word.charAt(last)){
                i++;
                last--;
            }
            else{
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome);
    }
}
