package CharacterOccurrenceCount;

import java.util.stream.Collectors;

public class UsingJava8Stream {
    public static void main(String[] args) {
        String str = "Hello World";
        str.chars().boxed().collect(Collectors.groupingBy(i -> (char) i.intValue(), Collectors.counting()))
                .forEach((k, v) -> System.out.println(k + ": " + v));
    }
}

