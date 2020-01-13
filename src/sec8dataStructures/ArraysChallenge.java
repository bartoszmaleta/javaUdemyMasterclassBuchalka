package sec8dataStructures;

import java.util.Scanner;
import java.util.Arrays;

public class ArraysChallenge {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myArray = getIntegers(5);
        printArray(myArray);

        System.out.println("-----------");

        int[] sortedArray = sortIntegers(myArray);
        printArray(sortedArray);

    }

    public static int[] getIntegers(int capacity) {
        int[] values = new int[capacity];
        System.out.println("Enter " + capacity + " integer elements: ");

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return values;
    }

    public static void printArray(int[] arrayToPrint) {
        for (int i = 0; i < arrayToPrint.length; i++) {
            System.out.println("Element " + i + ") typed value was = " + arrayToPrint[i]);
        }
    }

    public static int[] sortIntegers(int[] arrayToSort) {
        int[] sortedArray = new int[arrayToSort.length];
        for (int i = 0; i < arrayToSort.length - 1; i++) {
            sortedArray[i] = arrayToSort[i];
        }

        boolean flag = true;
        int temporarilyVariable;
        while (flag) {
            flag = false;
            // element 0 160
            // element 1 50
            // element 2 40
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temporarilyVariable = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temporarilyVariable;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }


    // ANOTHER OPTION OF COPYING ARRAY
    public static int[] copyOfArray(int[] arrayToSort) {
        int[] values = Arrays.copyOf(arrayToSort, arrayToSort.length);

        return values;
    }
}