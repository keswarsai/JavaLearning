package CountingVowelsandConsonants;

public class UsingStringMatches {
    public static void main(String[] args) {
        String str = "Hello World";
        int vowels = str.toLowerCase().replaceAll("[^aeiou]", "").length();
        int consonants = str.toLowerCase().replaceAll("[^bcdfghjklmnpqrstvwxyz]", "").length();
        
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}