package SubsetSubsequenceString;

public class RemoveStringApple {
    public static void main(String[] args) {
        System.out.println(skipApp("bcdapplefgapp"));
    }

    static String skip(String up){
        if(up.length() == 0){
            return "";
        }
        if(up.startsWith("apple")){
            return skip(up.substring("apple".length()));
        }
        else{
            return up.charAt(0) + skip(up.substring(1));
        }
    }

    static String skipApp(String up){
        if(up.length() == 0){
            return "";
        }
        if(!(up.startsWith("apple")) && up.startsWith("app")){
            return skipApp(up.substring(3));
        }
        else{
            return up.charAt(0) + skipApp(up.substring(1));
        }
    }
}
