public class NumberOfDigitsInBaseB {
    public static void main(String[] args) {
        int n = 10;
        int base = 10;
        int digits = (int)(Math.log(n) / Math.log(base)) + 1;
        System.out.println(digits);
    }
}
