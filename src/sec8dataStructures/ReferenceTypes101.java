package sec8dataStructures;

import java.util.Arrays;

public class ReferenceTypes101 {
    public static void main(String[] args) {

        int myIntValue = 10;
        int anotherIntValue = myIntValue;
        System.out.println("");

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        anotherIntValue++;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));
        
    }
}