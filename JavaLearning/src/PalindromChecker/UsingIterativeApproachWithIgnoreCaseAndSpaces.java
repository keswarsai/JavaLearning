package PalindromChecker;

public class UsingIterativeApproachWithIgnoreCaseAndSpaces {
    public static void main(String[] args) {
        String str = "A man a plan a canal Panama";
        str = str.replaceAll("\\s", "").toLowerCase();
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                System.out.println("Not a palindrome");
                return;
            }
            left++;
            right--;
        }
        System.out.println("Palindrome");
    }
}