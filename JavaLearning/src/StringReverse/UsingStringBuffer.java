package StringReverse;

public class UsingStringBuffer {
    public static void main(String[] args) {
        String str = "Hello World";
        StringBuffer sb = new StringBuffer(str);
        System.out.println(sb.reverse().toString());
    }
}