public class XOROfARange {
    public static void main(String[] args) {
        int a = 3, b = 9;
        int first = findXOR(0,b);
        int second = findXOR(0, a - 1);
        System.out.println(first ^ second);
    }

    private static int findXOR(int i, int b)
    {
        if(b % 4 == 0){
            return b;
        }
        else if(b % 4 == 1){
            return 1;
        }
        else if(b % 4 == 2){
            return b + 1;
        }
        else{
            return 0;
        }
    }
}
