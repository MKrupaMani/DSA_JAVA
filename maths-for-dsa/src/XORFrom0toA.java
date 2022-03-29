public class XORFrom0toA {
    public static void main(String[] args) {
        int a = 5;
        if(a % 4 == 0){
            System.out.println(a);
        }
        else if(a % 4 == 1){
            System.out.println(1);
        }
        else if(a % 4 == 2){
            System.out.println(a + 1);
        }
        else{
            System.out.println(0);
        }
    }
}
