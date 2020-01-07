package controlFlowStatements;

import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();

    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        double avg = 0;
        int counter = 0;

        while (true) {
            // System.out.println("Enter number");
            boolean isAnInt = scanner.hasNextInt();


            if (isAnInt) {
                counter++;
                int number = scanner.nextInt();
                sum += number;
            } else {
                if (counter < 2) {
                    System.out.println("SUM = " + sum + " AVG = " + avg);
                } else {
                    avg = sum / counter;
                    int avgInt = (int) avg;
                    System.out.println("SUM = " + sum + " AVG = " + avgInt);
                }
            }
            scanner.nextLine();
        }
        // scanner.close();
    }
}