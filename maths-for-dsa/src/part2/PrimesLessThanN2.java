package part2;

import java.util.Scanner;

public class PrimesLessThanN2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean[] arr = new boolean[n + 1];
        sieve(n,arr);
    }
    static void sieve(int n, boolean[] arr){
        // false means number is prime
        int c = 2;
        while(c <= Math.sqrt(n)){
            if(!arr[c]){
                for(int i = 2 * c; i < n; i+=c){
                    arr[i] = true;
                }
            }
            c++;
        }
        for (int i = 2; i <= n; i++) {
            if(!arr[i]){
                System.out.print(i+" ");
            }
        }
    }
}
