package CharacterOccurrenceCount;

public class UsingArrays  {
    public static void main(String[] args) {
        String str = "Hello World";
        int[] count = new int[256]; // assuming ASCII
        for (char c : str.toCharArray()) {
            count[c]++;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                System.out.println((char) i + ": " + count[i]);
            }
        }
    }
}

