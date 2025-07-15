package StringReverse;

public class UsingRecursion {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(reverse(str));
    }

    public static String reverse(String str) {
        if (str.isEmpty())
            return str;
        else
            return reverse(str.substring(1)) + str.charAt(0);
    }
}