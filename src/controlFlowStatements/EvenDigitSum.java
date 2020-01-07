package controlFlowStatements;

public class EvenDigitSum {
    public static void main(String[] args) {
        int evenDigitSum = getEvenDigitSum(123456789);
        System.out.println(evenDigitSum);

        int evenDigitSum2 = getEvenDigitSum(252);
        System.out.println(evenDigitSum2);

        int evenDigitSum3 = getEvenDigitSum(-22);
        System.out.println(evenDigitSum3);

    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }

        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            System.out.println("Digit = " + digit);

            if (digit % 2 == 0) {
                sum += digit;
            }

            System.out.println("Sum = " + sum);
            number /= 10;
        }

        return sum;
    }
}