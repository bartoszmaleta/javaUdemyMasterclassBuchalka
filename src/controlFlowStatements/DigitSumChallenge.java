package controlFlowStatements;

public class DigitSumChallenge {
    public static void main(String[] args) {
        int sumsEachDigitsOfNumber = sumDigits(1);
        System.out.println(sumsEachDigitsOfNumber);

        int sumsEachDigitsOfNumber2 = sumDigits(125);
        System.out.println(sumsEachDigitsOfNumber2);

        int sumsEachDigitsOfNumber3 = sumDigits(-125);
        System.out.println(sumsEachDigitsOfNumber3);

        int sumsEachDigitsOfNumber4 = sumDigits(4);
        System.out.println(sumsEachDigitsOfNumber4);

        int sumsEachDigitsOfNumber5 = sumDigits(32123);
        System.out.println("The sum of the digits is = " + sumsEachDigitsOfNumber5);


    }

    public static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }
        System.out.println("--------------------------------------");

        // works just one time for three-digits numbers!!!
        int firstNumber = number / 100;
        int secondNumber = (number / 10) % 10;
        int thirdNumber = number % 10;

        System.out.println(firstNumber);
        System.out.println(secondNumber);
        System.out.println(thirdNumber);

        int sumOfDigits = firstNumber + secondNumber + thirdNumber;
        System.out.println(sumOfDigits);

        // return sumOfDigits;

        System.out.println("--------------------------------------");
        // SOLUTION WITH LOOP:

        int sum = 0;
        // 125 -> 125 / 10 = 12 -> 12 * 10 = 120 -> 125 - 120 = 5
        while (number > 0) {
            int digit = number % 10;
            System.out.println("Digit = " + digit);
            sum += digit;
            System.out.println("Sum = " + sum);

            
            // drop the least significat digit
            number = number / 10;  // same as number /= 10;

        }
        
        return sum;

    }
}