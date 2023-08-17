package Array.medium;

public class PrintPossible {
    public static void main(String[] args) {
        String ans = "12345";
        helper(ans,"" );
    }
    public static void helper(String num, String up) {
        if(num.isEmpty()) {
            System.out.print(up + " , ");
            return;
        }
        char c= num.charAt(0);
        helper(num.substring(1), up + c);
        helper(num.substring(1), up);
    }
}
