package part2;

import java.util.Scanner;

public class PrimesLessThanN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 2; i < n; i++){
            if(isPrime(i)){
                System.out.print(i+"\t");
            }
        }
    }
    static boolean isPrime(int n){
        boolean prime = true;
        int i = 2;
        while(i <= Math.sqrt(n)){
            if(n % i == 0){
                return false;
            }
            i++;
        }
        return true;
    }
}
