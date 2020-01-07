package controlFlowStatements;

public class FirstLastDigitSum {
    public static void main(String[] args) {
        int sumOfFirstAndLastDigitOfNumber = sumFirstAndLastDigit(5);
        System.out.println(sumOfFirstAndLastDigitOfNumber);

        int sumOfFirstAndLastDigitOfNumber2 = sumFirstAndLastDigit(252);
        System.out.println(sumOfFirstAndLastDigitOfNumber2);

        int sumOfFirstAndLastDigitOfNumber3 = sumFirstAndLastDigit(257);
        System.out.println(sumOfFirstAndLastDigitOfNumber3);
        
        int sumOfFirstAndLastDigitOfNumber4 = sumFirstAndLastDigit(0);
        System.out.println(sumOfFirstAndLastDigitOfNumber4);

    }

    public static int sumFirstAndLastDigit(int number) {
        int sumOfFirstAndLast = 0;

        if (number < 10) {
            sumOfFirstAndLast = number * 2;
        }

        int lastDigit = number % 10;
        int firstDigit = number;

        while (firstDigit >= 10) {
            firstDigit = firstDigit / 10;
        }
        sumOfFirstAndLast = firstDigit + lastDigit;
        // System.out.println(sumOfFirstAndLast);

        if (number < 0) {
            return -1;
        } else if (number == 0) {
            return 0;
        } else
            return sumOfFirstAndLast;
    }
}