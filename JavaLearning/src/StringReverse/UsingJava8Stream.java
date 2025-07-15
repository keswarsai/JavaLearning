package StringReverse;

import java.util.stream.Stream;

public class UsingJava8Stream {
    public static void main(String[] args) {
        String str = "Hello World";
        String reversed = Stream.of(str.split(""))
                .reduce("", (a, b) -> b + a);
        System.out.println(reversed);
    }
}