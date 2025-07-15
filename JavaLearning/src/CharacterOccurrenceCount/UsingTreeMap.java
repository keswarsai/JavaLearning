package CharacterOccurrenceCount;

import java.util.TreeMap;

public class UsingTreeMap {
    public static void main(String[] args) {
        String str = "Hello World";
        TreeMap<Character, Integer> map = new TreeMap<>();
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        System.out.println(map);
    }
}