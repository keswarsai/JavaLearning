package CountingVowelsandConsonants;

public class UsingRecursion{
    public static void main(String[] args) {
        String str = "Hello World";
        int[] counts = countVowelsAndConsonants(str.toLowerCase(), 0, 0, 0);
        System.out.println("Vowels: " + counts[0]);
        System.out.println("Consonants: " + counts[1]);
    }
    
    public static int[] countVowelsAndConsonants(String str, int index, int vowels, int consonants) {
        if (index == str.length()) {
            return new int[] {vowels, consonants};
        }
        char c = str.charAt(index);
        if ("aeiou".indexOf(c) != -1) {
            vowels++;
        } else if (c >= 'a' && c <= 'z') {
            consonants++;
        }
        return countVowelsAndConsonants(str, index + 1, vowels, consonants);
    }
}

