package FindingSmalletNumber;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UsingCollections {
    public static void main(String[] args) {
        Integer[] numbers = {10, 20, 5, 30, 40};
        List<Integer> list = Arrays.asList(numbers);
        int smallest = Collections.min(list);
        System.out.println("Smallest number is: " + smallest);
    }
}
