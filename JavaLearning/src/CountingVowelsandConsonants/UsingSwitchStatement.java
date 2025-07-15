package CountingVowelsandConsonants;

public class UsingSwitchStatement {
    public static void main(String[] args) {
        String str = "Hello World";
        int vowels = 0;
        int consonants = 0;
        
        for (char c : str.toLowerCase().toCharArray()) {
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vowels++;
                    break;
                default:
                    if (c >= 'a' && c <= 'z') {
                        consonants++;
                    }
            }
        }
        
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
