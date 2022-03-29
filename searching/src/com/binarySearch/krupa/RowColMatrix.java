import java.util.*;
import java.lang.*;
import java.io.*;

public class RowColMatrix {
     public static void main(String[] args){
          int[][] mat = {
               {1,2,3},
               {4,7,11},
               {6,9,13}
          };
          
          System.out.println(Arrays.toString(binarySearch(mat,0)));
     }
     static int[] binarySearch(int[][] mat,int target){
          int start = 0;
          int end = mat.length - 1;
          while(start < mat.length && end >= 0){
               if(mat[start][end] == target){
                    return new int[]{start,end};
               }
               else if(mat[end][start] < target){
                    start++;
               }
               else{
                    end--;
               }
          }
          return new int[]{-1,-1};
     }
}