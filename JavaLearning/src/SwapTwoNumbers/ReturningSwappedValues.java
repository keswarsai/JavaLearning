package SwapTwoNumbers;

public class ReturningSwappedValues {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println("Before swap: a = " + a + ", b = " + b);
        
        int[] swapped = swap(a, b);
        a = swapped[0];
        b = swapped[1];
        
        System.out.println("After swap: a = " + a + ", b = " + b);
    }
    
    public static int[] swap(int a, int b) {
        return new int[] {b, a};
    }
}