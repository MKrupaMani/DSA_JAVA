public class IthBitOfANumber {
    public static void main(String[] args) {
        int i = 5;
        int n = 10110110;
        System.out.println(n & 1 << i - 1);
    }
}
