package CountingVowelsandConsonants;

public class UsingLoops {
    public static void main(String[] args) {
        String str = "Hello World";
        int vowels = 0;
        int consonants = 0;
        
        for (char c : str.toLowerCase().toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
