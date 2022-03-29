package SubsetSubsequenceString;

import java.util.Scanner;

public class RemoveA_s {
    public static void main(String[] args) {
        String str = "baccddah";
//        StringBuilder sb = new StringBuilder();
        System.out.println(remove1(str, 0));
//        System.out.println(sb);
    }

    private static void remove(String str, StringBuilder sb, int i) {
        if(i == str.length()){
            return;
        }
        if(str.charAt(i) != 'a'){
            sb.append(str.charAt(i));
        }
        remove(str,sb,i+1);
    }

    private static StringBuilder remove1(String str, int i) {
        StringBuilder sb = new StringBuilder();
        if( i  == str.length()){
            return sb;
        }
        if(str.charAt(i) != 'a'){
            sb.append(str.charAt(i));
        }
        StringBuilder sb2 = remove1(str, i + 1);
        sb.append(sb2);
        return sb;
    }
}
