package FindingSmalletNumber;

import java.util.Arrays;

public class UsingSorting{
    public static void main(String[] args) {
        int[] numbers = {10, 20, 5, 30, 40};
        Arrays.sort(numbers);
        int smallest = numbers[0];
        System.out.println("Smallest number is: " + smallest);
    }
}
