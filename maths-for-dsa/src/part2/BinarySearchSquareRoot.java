package part2;

public class BinarySearchSquareRoot {
    public static void main(String[] args) {
        int n = 40, p = 3;
        System.out.printf("%.3f",sqrt(n,p));
    }
    static double sqrt(int n, int p){
        int start = 1,end = n;
        while(start <= end){
            int mid = start + (end -  start) / 2;
            if(mid * mid == n){
                return mid;
            }
            else if(mid * mid < n){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        double root = 0.0;
        double incr = 0.1;
        for(int i = 0; i < p; i++){
            while(root * root <= n){
                root += incr;
            }
            root -= incr;
            incr /= 10;
        }
        return root;
    }
}
