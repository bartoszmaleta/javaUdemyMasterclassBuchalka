package app;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {
        System.out.println("firstNumber               = " + firstNumber);
        int realNumber = (int) firstNumber;
        System.out.println("realNumber                = " + realNumber);
        double remainingOfNumber = firstNumber - realNumber;
        System.out.println("remainingOfNumber         = " + remainingOfNumber);


        double num = 1.34567;
        DecimalFormat remainingOfNumberRounded = new DecimalFormat("#.###");
        remainingOfNumberRounded.setRoundingMode(RoundingMode.FLOOR);
        System.out.println("remainingOfNumberRounded  = " + remainingOfNumberRounded.format(remainingOfNumber));

        // secondNumber:



        return true;
    }

    public static void main(String[] args) {
        areEqualByThreeDecimalPlaces(3452.345, 98.23);
    }

}