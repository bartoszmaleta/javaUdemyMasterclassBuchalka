package sec8dataStructures;

import java.util.Scanner;

public class ResizingArray104Video {
    private static Scanner scanner = new Scanner(System.in);
    private static int[] baseData = new int[10];
    public static void main(String[] args) {
        System.out.println("Enter 10 integers: ");
        getInput();
        printArray(baseData);
        resizeArray();
        System.out.println("Enter 12 integers: "); // comment this for second option
        getInput();                                // comment this for second option
        // baseData[10] = 67;
        // baseData[11] = 34;
        printArray(baseData);

        
    }

    private static void getInput() {
        for (int i = 0; i < baseData.length; i++) {
            baseData[i] = scanner.nextInt();
        }
    }

    private static void printArray(int[] arrayToPrint) {
        for (int i = 0; i < arrayToPrint.length; i++) {
            System.out.print (arrayToPrint[i] + " ");
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