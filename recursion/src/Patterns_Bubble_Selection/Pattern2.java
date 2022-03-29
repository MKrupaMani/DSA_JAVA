package Patterns_Bubble_Selection;

public class Pattern2 {
    public static void main(String[] args) {
        int n = 4;
        triangle(0,0,n);
    }

    static void triangle(int r, int c, int n){
        if(r == n){
            return;
        }
        if(c <= r){
            System.out.print("* ");
            triangle(r, c+1, n);
        }
        else{
            System.out.println();
            triangle(r+1, 0, n);
        }
    }
}
