package app;

public class ByteShortIntLong {
    public static void main(String[] args) {
        System.out.println("---------------------------");

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        // Integer Minimum Value = -2147483648
        // Integer Maximum Value = 2147483647

        System.out.println("---------------------------");
        System.out.println("Busted MAX value = " + (myMaxIntValue + 1));
        // Its OVERFLOW
        // Busted MAX value = -2147483648
        

        System.out.println("Busted MIN value = " + (myMinIntValue - 1));
        // UNDERFLOW
        // Busted MIN value = 2147483647

        int myMaxIntTest = 2147483647;
        // int myMaxIntTest2 = 2147483648;   // It will give us an error

        System.out.println("---------------------------");
        int myMaxIntTest3 = 2_147_483_647;

        System.out.println(myMaxIntTest3);

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println("Byte Minimum Value = " + (myMinByteValue));
        System.out.println("Byte Maximum Value = " + (myMaxByteValue));


        System.out.println("---------------------------");

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;

        System.out.println("Short Minimum Value = " + (myMinShortValue));
        System.out.println("Short Maximum Value = " + (myMaxShortValue));

        System.out.println("---------------------------");

    }

}