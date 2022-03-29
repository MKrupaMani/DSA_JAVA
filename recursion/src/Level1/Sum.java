package Level1;

public class Sum {
    public static void main(String[] args) {
        System.out.println(sumTillN(5));
    }
    static int sumTillN(int n){
        if(n == 0){
            return 0;
        }
        return n + sumTillN ( n - 1);
    }
}
