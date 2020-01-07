package controlFlowStatements;

public class LastDigitChecker {
    public static void main(String[] args) {
        boolean checkIfNumbersHasSameLastDigit = hasSameLastDigit(41, 22, 71);
        System.out.println(checkIfNumbersHasSameLastDigit);
        
        boolean checkIfNumbersHasSameLastDigit2 = hasSameLastDigit(23, 32, 42);
        System.out.println(checkIfNumbersHasSameLastDigit2);

        boolean checkIfNumbersHasSameLastDigit3 = hasSameLastDigit(9, 99, 999);
        System.out.println(checkIfNumbersHasSameLastDigit3);
    }

    public static boolean hasSameLastDigit (int firstNumber, int secondNumber, int thirdNumber) {
        if (((firstNumber < 10) || (firstNumber > 1000)) || ((secondNumber < 10) || (secondNumber > 1000)) || ((thirdNumber < 10) || (thirdNumber > 1000))) {
            return false;
            // } else return true;
        }

        int lastDigitOfFirstNumber = 0;
        int lastDigitOfSecondNumber = 0;
        int lastDigitOfThirdNumber = 0;



        if (firstNumber >= 100) {
            lastDigitOfFirstNumber = firstNumber % 100;
        }

        if (firstNumber >= 10) {
            lastDigitOfFirstNumber = firstNumber % 10;
        }

        if (secondNumber>= 100) {
            lastDigitOfSecondNumber= secondNumber % 100;
        }

        if (secondNumber >= 10) {
            lastDigitOfSecondNumber = secondNumber % 10;
        }

        if (thirdNumber >= 100) {
            lastDigitOfThirdNumber= thirdNumber % 100;
        }

        if (thirdNumber >= 10) {
            lastDigitOfThirdNumber= thirdNumber % 10;
        }

        if (lastDigitOfFirstNumber == lastDigitOfSecondNumber || lastDigitOfFirstNumber == lastDigitOfThirdNumber || lastDigitOfSecondNumber == lastDigitOfThirdNumber) {
            return true;
        } else {
            return false;
        }
    }

}