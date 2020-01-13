package sec8dataStructures;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElementChallenge102 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int count = 0;

        while (counter < 1) {
            int order = counter + 1;
            System.out.println("Enter number of elements:");

            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                count = scanner.nextInt();
                counter++;
            } else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine(); // handle end of line (enter key)
        }

        System.out.println(count);
        int[] integersInputted = readIntegers(count);

        printArray(integersInputted);

        int minValue = findMin(integersInputted);
        System.out.println("Minimmum value = " + minValue);
    }

    public static int[] readIntegers(int count) {
        int[] arrayOfIntegersEntered = new int[count];
        for (int i = 0; i < arrayOfIntegersEntered.length; i++) {
            System.out.println("Enter a number: ");
            arrayOfIntegersEntered[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return arrayOfIntegersEntered;
    }

    public static void printArray(int[] arrayToPrint) {
        for (int i = 0; i < arrayToPrint.length; i++) {
            System.out.println("Element " + i + ") typed value was = " + arrayToPrint[i]);
        }
    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            if (value < min) {
                min = value;
            }
        }
        return min;
    }
}