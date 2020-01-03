package app;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class DecimalComparatorCleanVersion {
    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {

        System.out.println("========================");
        System.out.println("firstNumber               = " + firstNumber);
        System.out.println("secondNumber               = " + secondNumber);

        // firstNumber:
        DecimalFormat firstNumberRounded = new DecimalFormat("#.###");
        firstNumberRounded.setRoundingMode(RoundingMode.CEILING);
        System.out.println("firstNumberRounded = " + firstNumberRounded.format(firstNumber));

        double firstNumberParsed = Double.parseDouble(firstNumberRounded.format(firstNumber));
        // System.out.println("firstNumberRounded = " + firstNumberParsed);

        // ----------------------------------------------------------------

        // secondNumber:
        DecimalFormat secondNumberRounded = new DecimalFormat("#.###");
        secondNumberRounded.setRoundingMode(RoundingMode.CEILING);
        System.out.println("secondNumberRounded = " + secondNumberRounded.format(secondNumber));
        
        double secondNumberParsed = Double.parseDouble(secondNumberRounded.format(secondNumber));
        // System.out.println("secondNumberRounded = " + secondNumberParsed);

        if (firstNumberParsed == secondNumberParsed) {
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