public class UnsetABit {
    public static void main(String[] args) {
        int n = 50;
        int i = 5;
        System.out.println(n & ~(1 << (i - 1)));
    }
}
