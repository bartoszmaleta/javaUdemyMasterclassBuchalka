package sec8dataStructures;

import java.util.Scanner;
import java.util.Arrays;

public class ArraysChallenge {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myArray = getIntegers(5);
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Element " + i + ") typed value was = " + myArray[i]);
        }

    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer elements: ");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return values;
    }
}