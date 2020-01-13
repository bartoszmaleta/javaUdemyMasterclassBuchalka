package sec8dataStructures;

import java.util.Scanner;

public class Arrays {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntArray = new int[10];
        myIntArray[5] = 50;
        System.out.println(myIntArray); // reference in memory
        System.out.println(myIntArray[5]); // 50

        double[] myDoubleArray = new double[10];

        int[] myIntArray2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(myIntArray2[5]); // 6
        System.out.println(myIntArray2[0]); // 1
        System.out.println(myIntArray2[8]); // 9

        int[] myIntArray3 = new int[10];
        // for (int i = 0; i < 10; i++) {
        for (int i = 0; i < myIntArray3.length; i++) { // better to use length!
            myIntArray3[i] = i * 10;
        }
        for (int i = 0; i < myIntArray3.length; i++) {
            System.out.println("Element " + i + ", value is " + myIntArray3[i]);
        }
        // or
        System.out.println("-----------");
        printArray(myIntArray3);

        System.out.println("-----------");
        System.out.println("-----------");

        int[] myIntegers = getIntegers(5);
        for (int i = 0; i < myIntegers.length; i++) {
            System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
        }

        System.out.println("-----------");
        System.out.println("-----------");

        System.out.println("The average is " + getAverarge(myIntegers));
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer value: \r");
        int[] values = new int[number];

        for (int i=0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static double getAverarge(int[] array) {
        int sumTotal = 0;
        for (int i = 0; i < array.length; i++) {
            sumTotal += array[i];
        }
        double average = sumTotal / array.length;
        return average;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + ", value is " + array[i]);
        }
    }

}