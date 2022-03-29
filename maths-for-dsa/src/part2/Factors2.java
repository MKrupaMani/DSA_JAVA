package part2;

import java.util.ArrayList;

public class Factors2 {
    public static void main(String[] args) {
        int n = 20;
        int i = 1;
        ArrayList<Integer> li = new ArrayList<>();
        while (i * i <= n) {
            if (n % i == 0) {
                if (i == n / i)
                    System.out.print(i + " ");
                else {
                    System.out.print(i + " ");
                    li.add(n / i);
                }
            }
            i++;
        }
        for(i = li.size() - 1; i >= 0; i--){
            System.out.print(li.get(i) + " ");
        }
    }
}
