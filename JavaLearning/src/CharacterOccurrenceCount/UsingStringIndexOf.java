package CharacterOccurrenceCount;

public class UsingStringIndexOf {
    public static void main(String[] args) {
        String str = "Hello World";
        for (char c : str.toCharArray()) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == c) {
                    count++;
                }
            }
            System.out.println(c + ": " + count);
        }
    }
}
