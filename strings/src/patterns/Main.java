package patterns;

public class Main {
    public static void main(String[] args) {
        pattern9(5);
    }

    static void pattern1(int n){
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= n; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    static void pattern2(int n){
        for(int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){
        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n){
        for(int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        for(int i = 1; i <= n/2; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = n/2 + 1; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(j <= n - i){
                    System.out.print("  ");
                }
                else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    static void pattern7(int n){
        for(int i = 5; i >= 1; i--){
            for(int j = 1; j <= n; j++){
                if(j <= n - i){
                    System.out.print("  ");
                }
                else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    static void pattern8(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n - i; j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= 2 * (i - 1) + 1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern9(int n){
        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= n - i; j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= 2 * (i - 1) + 1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
