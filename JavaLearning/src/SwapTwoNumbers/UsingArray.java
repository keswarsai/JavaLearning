package SwapTwoNumbers;

public class UsingArray {
    public static void main(String[] args) {
        int[] arr = {5, 10};
        System.out.println("Before swap: a = " + arr[0] + ", b = " + arr[1]);
        
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
        
        System.out.println("After swap: a = " + arr[0] + ", b = " + arr[1]);
    }
}