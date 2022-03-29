// given a number and check whether it's a power or 2 or not
public class PowerOf2 {
    public static void main(String[] args) {
        int n = 16;
        int count = 0;
        while(n > 0){
            int digit = n & 1;
            if(digit == 1){
                count++;
            }
            n >>= 1;
        }
        if(count == 1){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
