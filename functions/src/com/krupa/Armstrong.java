package com.krupa;

public class Armstrong {
    public static void main(String[] args) {
        for(int i = 100; i < 1000;i++){
            if(isArmstrong(i)){
                System.out.print(i+"  ");
            }
        }
    }
    static boolean isArmstrong(int n){
        int lastDigit,sum = 0,temp = n;
        while(n > 0){
            lastDigit = n % 10;
            sum += Math.pow(lastDigit,3);
            n /= 10;
        }
        return temp==sum;
    }
}
