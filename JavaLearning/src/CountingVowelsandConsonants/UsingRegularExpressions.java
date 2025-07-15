package CountingVowelsandConsonants;

public class UsingRegularExpressions{
    public static void main(String[] args) {
        String str = "Hello World";
        int vowels = str.toLowerCase().replaceAll("[^aeiou]", "").length();
        int consonants = str.toLowerCase().replaceAll("[^a-z]", "").length() - vowels;
        
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
