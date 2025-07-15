package CharacterOccurrenceCount;

import java.util.Hashtable;

public class UsingHashTable  {
    public static void main(String[] args) {
        String str = "Hello World";
        Hashtable<Character, Integer> table = new Hashtable<>();
        for (char c : str.toCharArray()) {
            table.put(c, table.getOrDefault(c, 0) + 1);
        }
        System.out.println(table);
    }
}
