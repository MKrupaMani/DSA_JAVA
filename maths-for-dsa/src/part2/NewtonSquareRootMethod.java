package part2;

public class NewtonSquareRootMethod {
    public static void main(String[] args) {
        int n = 40;
        double x = n;
        double root;
        while(true){
            root = (x + n / x) / 2;
            if(Math.abs(root - x) < 0.5){
                break;
            }
            x = root;
        }
        System.out.println(root);
    }
}
