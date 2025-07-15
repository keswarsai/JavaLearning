package CountingVowelsandConsonants;

public class UsingASCIIValues {
    public static void main(String[] args) {
        String str = "Hello World";
        int vowels = 0;
        int consonants = 0;
        
        for (char c : str.toLowerCase().toCharArray()) {
            int ascii = (int) c;
            if (ascii >= 97 && ascii <= 122) {
                if (ascii == 97 || ascii == 101 || ascii == 105 || ascii == 111 || ascii == 117) {
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
