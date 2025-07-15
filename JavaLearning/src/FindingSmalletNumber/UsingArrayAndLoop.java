package FindingSmalletNumber;

public class UsingArrayAndLoop {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 5, 30, 40};
        int smallest = numbers[0];
        
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        
        System.out.println("Smallest number is: " + smallest);
    }
}