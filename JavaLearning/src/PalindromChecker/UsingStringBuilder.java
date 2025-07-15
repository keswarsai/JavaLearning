package PalindromChecker;

public class UsingStringBuilder {
    public static void main(String[] args) {
        String str = "madam";
        StringBuilder sb = new StringBuilder(str);
        if (str.equalsIgnoreCase(sb.reverse().toString())) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }
    }
}
