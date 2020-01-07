package controlFlowStatements;

import java.util.Scanner;

public class MinAndMaxInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // int max = Integer.MAX_VALUE; // or:
        int maximum = -217483648;   // comment these lines to second solution
        
        // int min = Integer.MIN_VALUE; // or:
        int minimum = 2147483647;   // comment these lines to second solution

        // =============== SECOND SOLUTION ==========
        // int maximum = 0;
        // int minimum = 0;
        // boolean firstLoop = true;

        while (true) {
            System.out.println("Enter number");

            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();

                // =============== SECOND SOLUTION ==========
                // if (firstLoop) {
                // firstLoop = false;
                // minimum = number;
                // maximum = number;
                // }
                if (number > maximum) {
                    maximum = number;
                }
                if (number < minimum) {
                    minimum = number;
                }
            } else {
                System.out.println("Invalid number. Program is exiting.");
                break;
            }
            scanner.nextLine(); // handle end of line (enter key)
        }
        System.out.println("Minimum = " + minimum);
        System.out.println("Maxmium = " + maximum);
        scanner.close();
    }
}