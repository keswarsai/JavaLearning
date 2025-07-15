package CharacterOccurrenceCount;

public class UsingRecursion {
    public static void main(String[] args) {
        String str = "Hello World";
        int[] count = new int[256]; // assuming ASCII
        countChars(str, 0, count);
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                System.out.println((char) i + ": " + count[i]);
            }
        }
    }
    
    public static void countChars(String str, int index, int[] count) {
        if (index == str.length()) {
            return;
        }
        count[str.charAt(index)]++;
        countChars(str, index + 1, count);
    }
}
