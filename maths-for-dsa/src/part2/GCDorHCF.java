package part2;

public class GCDorHCF {
    public static void main(String[] args) {
        int a = 3, b = 7;
        System.out.println(gcd(a,b));
        System.out.println(lcm(a,b));
    }
    static int gcd(int a, int b){
        if(a == 0){
            return b;
        }
        return gcd(b % a,a);
    }
    static int lcm(int a, int b){
        int c = gcd(a,b);
        return (a*b)/c;
    }
}
