package FindingLargestNumber;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UsingCollections {
    public static void main(String[] args) {
        Integer[] numbers = {10, 20, 30, 40, 50};
        List<Integer> list = Arrays.asList(numbers);
        int largest = Collections.max(list);
        System.out.println("Largest number is: " + largest);
    }
}