package StringReverse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UsingCollectionsReverseMethod {
    public static void main(String[] args) {
        String str = "Hello World";
        List<Character> list = new ArrayList<>();
        for (char c : str.toCharArray()) {
            list.add(c);
        }
        Collections.reverse(list);
        StringBuilder reversed = new StringBuilder();
        for (char c : list) {
            reversed.append(c);
        }
        System.out.println(reversed.toString());
    }
}