package CountingVowelsandConsonants;

public class UsingJava8Stream {
    public static void main(String[] args) {
        String str = "Hello World";
        long vowels = str.toLowerCase().chars().filter(c -> "aeiou".indexOf((char) c) != -1).count();
        long consonants = str.toLowerCase().chars().filter(c -> c >= 'a' && c <= 'z' && "aeiou".indexOf((char) c) == -1).count();
        
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
