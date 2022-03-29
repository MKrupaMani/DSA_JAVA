public class SetABit {
    public static void main(String[] args) {
        int n = 50;
        int i = 4;
        System.out.println(n | 1 << i - 1);
    }
}
