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


        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;

        System.out.println("Long Minimum Value = " + (myMinLongValue));
        System.out.println("Long Maximum Value = " + (myMaxLongValue));

        long bigLongLiteralValue = 2_147_483_647_234L;
        // long bigLongLiteralValue = 2_147_483_647_234;  // need L in the end
        // convert int to long

        short bigShortLiteralValue = 32767;
        // short bigShortLiteralValue = 32768;  // out of range of short
        
        System.out.println("---------------------------");


        int myTotal = (myMinIntValue / 2);
        // byte myNewByteValue = (myMinByteValue / 2);   // error expect int
        // int is used by default

        byte myNewByteValue = (byte) (myMinByteValue / 2);

        short myNewShortValue = (short) (myMinShortValue / 2);

        System.out.println("---------------------------");
        
        byte variableByte = 100;
        short variableShort = 200;
        int variableInt = 300;
        long variableLong = 50000L + 10L * (variableByte + variableShort + variableInt);
        // long variable need to casting 

        // There are specific suffixes for long (e.g. 39832L), float (e.g. 2.4f) 
        // and double (e.g. -7.832d).
        // If there is no suffix, and it is an integral type (e.g. 5623), 
        // it is assumed to be an int. If it is not an integral type (e.g. 3.14159), 
        // it is assumed to be a double.
        // 
        // In all other cases (byte, short, char), you need the 
        // cast as there is no specific suffix.

        System.out.println(variableLong);

        System.out.println("---------------------------");

        // short shortTotal = (1000 + 10 * (variableByte + variableShort + variableInt));  // expect short
        short shortTotal = (short) (1000 + 10 * (variableByte + variableShort + variableInt));

        

    }

}