package PalindromChecker;

public class UsingToCharArray {
    public static void main(String[] args) {
        String str = "madam";
        char[] arr = str.toCharArray();
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            if (arr[left] != arr[right]) {
                System.out.println(str + " is not a palindrome");
                return;
            }
            left++;
            right--;
        }
        System.out.println(str + " is a palindrome");
    }
}
