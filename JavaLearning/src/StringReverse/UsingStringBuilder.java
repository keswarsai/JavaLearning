package StringReverse;

public class UsingStringBuilder {
    public static void main(String[] args) {
        String str = "Hello World";
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse().toString());
    }
}