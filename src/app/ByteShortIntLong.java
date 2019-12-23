package app;

public class ByteShortIntLong {
    public static void main(String[] args) {

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        // Integer Minimum Value = -2147483648
        // Integer Maximum Value = 2147483647

        System.out.println("Busted MAX value = " + (myMaxIntValue + 1));
        // Its overfloat
        // Busted MAX value = -2147483648
    }

}