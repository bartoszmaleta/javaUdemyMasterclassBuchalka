package sec8dataStructures;

import java.util.Scanner;

public class ResizingArray104Video {
    private static Scanner scanner = new Scanner(System.in);
    private static int[] baseData = new int[10];
    public static void main(String[] args) {
        System.out.println("Enter 10 integers: ");

    }

    private static void getInput() {
        for (int i = 0; i < baseData.length; i++) {
            baseData[i] = scanner.nextInt();
        }
    }

    private static void printArray(int[] arrayToPrint) {
        for (int i = 0; i < arrayToPrint.length; i++) {
            System.out.println(arrayToPrint[i] + " ");
        }
        System.out.println();
    }

    private static void resizeArray() {
        int[] originalData = baseData;

        baseData = new int[12];
        for (int i = 0; i < originalData.length; i++) {
            baseData[i] = originalData[i];
        }
    }
}