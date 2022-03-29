package part2;

import java.util.Scanner;

public class SquareOfANum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double squareRoot = Math.sqrt(n);
        System.out.println(squareRoot);
    }
}
