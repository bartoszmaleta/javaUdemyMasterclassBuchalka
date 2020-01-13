package sec8dataStructures;

import java.util.Scanner;

public class MinimumElementChallenge102 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int count = 0;

        while (counter < 1) {
            int order = counter + 1;
            System.out.println("Enter number of elements in the array " + order + ":");

            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                count = scanner.nextInt();
                // count = (int) Integer.parseInt(count);
                counter++;
            } else {
                System.out.println("Error! Input is not a int");
            }
            scanner.nextLine();
        }
        System.out.println(count);
        int[] integersInputted = readIntegers(count);
        printArray(integersInputted);
    }

    public static int[] readIntegers(int count) {
        int[] arrayOfIntegersEntered = new int[count];
        System.out.println("Enter " + count + " integer elements: ");
        for (int i = 0; i < arrayOfIntegersEntered.length; i++) {
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

    public static int findMin(int[] array) {
        int minValue = 0;
        return minValue;
    }
}