package CharacterOccurrenceCount;

public class UsingStringReplace{
    public static void main(String[] args) {
        String str = "Hello World";
        for (char c : str.toCharArray()) {
            int count = str.length() - str.replace(String.valueOf(c), "").length();
            System.out.println(c + ": " + count);
        }
    }
}
