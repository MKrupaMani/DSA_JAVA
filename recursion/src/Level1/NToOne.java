package Level1;

public class NToOne {
    public static void main(String[] args) {
        int n = 10;
        print(n);
    }
    static void print(int n){
        System.out.println(n);
        if(n == 1){
            return;
        }
        print(n - 1);
    }
}
