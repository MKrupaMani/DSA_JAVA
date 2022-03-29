package Level1;

public class CountOfZeroes {
    public static void main(String[] args) {
        System.out.println(countOfZeroes(1020, 0));
    }

    static int countOfZeroes(int n, int count){
        if(n == 0){
            return count;
        }
        if(n % 10 == 0){
            count++;
        }
        return countOfZeroes(n / 10, count);
    }
}
