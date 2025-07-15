package SwapTwoNumbers;

public class BitwiseXOR {
    public static void main(String[] args) {  // Without Using Temporary Variable (Bitwise XOR)
        int a = 5;
        int b = 10;
        System.out.println("Before swap: a = " + a + ", b = " + b);
        
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        
        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}
