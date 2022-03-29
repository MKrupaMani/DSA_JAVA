import java.lang.*;
import java.util.*;
import java.io.*;

public class SortedMatrix{
     public static void main(String[] args){
          int[][] mat = {
               {1,2,3},
               {4,5,6},
               {7,8,9}
          };
          System.out.println(Arrays.toString(searchRow(mat,5)));
     }
     static int searchRow(int[][] mat,int target){
          int start = 0;
          int end = mat.length - 1;
          while(start <= end){
               int mid = start + (end - start) / 2;
               if(mat[mid][0] < target){
                    start++;
               }
               else{
                    
               }
          } 
     }
}