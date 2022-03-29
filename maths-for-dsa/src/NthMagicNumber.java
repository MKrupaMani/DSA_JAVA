public class NthMagicNumber {
    public static void main(String[] args) {
        int n = 4;
        int magicNumber = 0;
        int i = 1;
        while(n > 0){
            magicNumber = (int) (magicNumber + ((n & 1) * Math.pow(5,i)));
            n = n >> 1;
            i++;
        }
        System.out.println(magicNumber);
    }
}
