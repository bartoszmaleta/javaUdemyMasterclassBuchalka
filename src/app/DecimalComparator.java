package app;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {
        int realNumber = (int) firstNumber;
        System.out.println(realNumber);
        double remainingOfNumber = firstNumber - realNumber;
        System.out.println("Remaining:   " + remainingOfNumber);

        // BigDecimal remainingOfNumberRounded = new BigDecimal(remainingOfNumber).setScale(3, RoundingMode.HALF_EVEN);
        // remainingOfNumber = remainingOfNumberRounded.doubleValue();

        return true;
    }

    public static void main(String[] args) {
        areEqualByThreeDecimalPlaces(3452.345, 98.23);
    }

}