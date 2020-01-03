package app;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {

        // System.out.println("========================");
        // System.out.println("firstNumber = " + firstNumber);
        // System.out.println("secondNumber = " + secondNumber);

        int firstNumberInt = (int) (firstNumber * 1000);

        int secondNumberInt = (int) (secondNumber * 1000);

        if (firstNumberInt == secondNumberInt) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {

        // areEqualByThreeDecimalPlaces(3452.3456, 98.23);
        areEqualByThreeDecimalPlaces(-3.1756, 98.23);
        boolean threeDec = areEqualByThreeDecimalPlaces(3.1756, 3.175);
        System.out.println(threeDec);

    }
}