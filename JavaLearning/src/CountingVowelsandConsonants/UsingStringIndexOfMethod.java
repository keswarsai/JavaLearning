package CountingVowelsandConsonants;

public class UsingStringIndexOfMethod {
    public static void main(String[] args) {
        String str = "Hello World";
        int vowels = 0;
        int consonants = 0;
        
        for (char c : str.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                vowels++;
            } else if (c >= 'a' && c <= 'z') {
                consonants++;
            }
        }
        
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}