//0. [Check if the Sentence Is Pangram](https://leetcode.com/problems/check-if-the-sentence-is-pangram/)
package com.Assignment3;

public class Ten {
    public static void main(String[] args) {
        String sentence = "abcdefghijklmnopqrstuvwxyz";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int count=0;
        for(int i = 0; i < alphabet.length(); i++){
            String str = Character.toString(alphabet.charAt(i));
            if(sentence.contains(str)){
                count++;
            };
        }
        if(count == 26){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
