package controlFlowStatements;

public class NumberToWords {
    public static void main(String[] args) {
        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);

        System.out.println(reverse(-121));
        System.out.println(reverse(1212));
        System.out.println(reverse(1234));
        System.out.println(reverse(100));

        System.out.println(getDigitCount(0));
        System.out.println(getDigitCount(123));
        System.out.println(getDigitCount(-12));
        System.out.println(getDigitCount(5200));
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }

        int reversed = reverse(number);
        int numberOfDigitsAtFirst = getDigitCount(number);

        for (int i = 0; i < numberOfDigitsAtFirst; i++) {
            int lastDigitOfReversedNumber = reversed % 10;
            if (lastDigitOfReversedNumber == 0) {
                System.out.println("Zero");
            } else if (lastDigitOfReversedNumber == 1) {
                System.out.println("One");
            } else if (lastDigitOfReversedNumber == 2) {
                System.out.println("Two");
            } else if (lastDigitOfReversedNumber == 3) {
                System.out.println("Three");
            } else if (lastDigitOfReversedNumber == 4) {
                System.out.println("Four");
            } else if (lastDigitOfReversedNumber == 5) {
                System.out.println("Five");
            } else if (lastDigitOfReversedNumber == 6) {
                System.out.println("Six");
            } else if (lastDigitOfReversedNumber == 7) {
                System.out.println("Seven");
            } else if (lastDigitOfReversedNumber == 8) {
                System.out.println("Eight");
            } else if (lastDigitOfReversedNumber == 9) {
                System.out.println("Nine");
            }
            reversed /= 10;
        }
    }

    public static int reverse(int number) {
        int reversedNumber = 0;
        int lastDigit = 0;

        while (number != 0) {
            lastDigit = number % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            number /= 10;
        }
        return reversedNumber;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        } else if (number == 0) {
            return 1;
        }

        int numberOfDigits = 0;
        while (number > 0) {
            numberOfDigits += 1;
            number /= 10;
        }

        return numberOfDigits;
    }
}