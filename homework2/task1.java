package homework2;

public class task1 {
    public static Boolean isPalindrome(String myStr) {
        for (int i = 0; i < myStr.length() / 2; ++i) {
            
            if (myStr.toLowerCase().charAt(i) != myStr.toLowerCase().charAt(myStr.length() - i - 1)) {
                return false; 
            }
        }
        return true; 
    }
    public static void main(String[] args) {
        String forCheck = "Level";
        if(isPalindrome(forCheck))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
