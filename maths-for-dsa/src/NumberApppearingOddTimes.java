public class NumberApppearingOddTimes {
    public static void main(String[] args) {
        int[] arr = {2,2,3,2,7,7,8,7,8,8};
        int sum = 0;
        for(int i : arr){
            sum += i;
        }
        System.out.println(sum % 3);
    }
}
