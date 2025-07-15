package CountingVowelsandConsonants;

import java.util.HashSet;

public class UsingHashSet{
    public static void main(String[] args) {
        String str = "Hello World";
        int vowels = 0;
        int consonants = 0;
        HashSet<Character> vowelSet = new HashSet<>();
        vowelSet.add('a');
        vowelSet.add('e');
        vowelSet.add('i');
        vowelSet.add('o');
        vowelSet.add('u');
        
        for (char c : str.toLowerCase().toCharArray()) {
            if (vowelSet.contains(c)) {
                vowels++;
            } else if (c >= 'a' && c <= 'z') {
                consonants++;
            }
        }
        
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}