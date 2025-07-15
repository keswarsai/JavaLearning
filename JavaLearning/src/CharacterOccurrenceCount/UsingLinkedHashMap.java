package CharacterOccurrenceCount;

import java.util.LinkedHashMap;

public class UsingLinkedHashMap {
    public static void main(String[] args) {
        String str = "Hello World";
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        System.out.println(map);
    }
}
