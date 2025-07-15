package SwapTwoNumbers;

import java.util.concurrent.atomic.AtomicInteger;

public class UsingAtomicInteger {
    public static void main(String[] args) {
        AtomicInteger a = new AtomicInteger(5);
        AtomicInteger b = new AtomicInteger(10);
        System.out.println("Before swap: a = " + a + ", b = " + b);
        
        int temp = a.get();
        a.set(b.get());
        b.set(temp);
        
        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}
