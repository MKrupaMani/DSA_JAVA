public class APowerB {
    public static void main(String[] args) {
        int base = 3;
        int power = 6;
        int sum = 1;
        while(power > 0){
            if((power & 1) == 1){
                base *= base;
                sum *= base;
            }
            power >>= 1;
        }
        System.out.println(sum);
    }
}
