package Level1;

public class ReverseOfANum {
    static int sum = 0;
    public static void main(String[] args) {

        System.out.println(reverse2(243));
    }
    static void reverse1(int n){
        if( n == 0){
            return;
        }
        sum = sum * 10 + (n % 10);
        reverse1(n / 10);
    }

    static int reverse2(int n){
        int digits = (int) (Math.log10(n) + 1);
        return helper(n, digits);
    }

    private static int helper(int n, int digits) {
        if(n % 10 == n){
            return n;
        }
        return (int) ((n % 10) * Math.pow(10, digits - 1) + helper(n / 10, digits-1));
    }

}
