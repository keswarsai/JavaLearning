package PalindromChecker;

public class UsingSubstring {
    public static void main(String[] args) {
        String str = "madam";
        if (str.length() <= 1) {
            System.out.println(str + " is a palindrome");
        } else if (str.charAt(0) == str.charAt(str.length() - 1)) {
            if (isPalindrome(str.substring(1, str.length() - 1))) {
                System.out.println(str + " is a palindrome");
            } else {
                System.out.println(str + " is not a palindrome");
            }
        } else {
            System.out.println(str + " is not a palindrome");
        }
    }
    
    public static boolean isPalindrome(String str) {
        if (str.length() <= 1) return true;
        if (str.charAt(0) != str.charAt(str.length() - 1)) return false;
        return isPalindrome(str.substring(1, str.length() - 1));
    }
}
