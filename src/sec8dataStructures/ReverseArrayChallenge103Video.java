package sec8dataStructures;

import java.util.Arrays;

public class ReverseArrayChallenge103Video {

    // static int[] myArray = {1, 2, 3, 4, 5};

    // static int[] arrayReversed = new int[myArray.length];

    public static void main(String[] args) {

        int[] myArray = {22, 12, 3, 5, 75};

        System.out.println("Array = " + Arrays.toString(myArray));

        reverse(myArray);
        System.out.println("Reversed Array = " + Arrays.toString(myArray));
    }

    private static void reverse(int[] arrayToReverse) {
        int maxIndex = arrayToReverse.length - 1;
        int halfLength = arrayToReverse.length / 2;

        for (int i = 0; i < halfLength; i++) {
            int temporarilyVariable = arrayToReverse[i];
            arrayToReverse[i] = arrayToReverse[maxIndex - i];
            arrayToReverse[maxIndex - i] = temporarilyVariable;
        }
    }
}