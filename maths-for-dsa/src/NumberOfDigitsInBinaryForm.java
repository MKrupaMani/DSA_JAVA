public class NumberOfDigitsInBinaryForm {
    public static void main(String[] args) {
        int n = 16;
//        int base = 2;
//        System.out.println((int)(Math.log(n) / Math.log(base)) + 1);
        int counter = 0;
        while(n > 0){
            counter++;
            n >>= 1;
        }
        System.out.println(counter);
    }
}
