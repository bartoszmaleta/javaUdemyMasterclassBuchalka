package controlFlowStatements;

public class SharedDigit {
    public static void main(String[] args) {
        boolean checkIfNumberSharesDigits = hasSharedDigit(12, 23);
        System.out.println(checkIfNumberSharesDigits);

        boolean checkIfNumberSharesDigits2 = hasSharedDigit(9, 99);
        System.out.println(checkIfNumberSharesDigits2);

        boolean checkIfNumberSharesDigits3 = hasSharedDigit(15, 55);
        System.out.println(checkIfNumberSharesDigits3);

    }

    public static boolean hasSharedDigit(int firstNumber, int secondNumber) {
        if (((firstNumber < 10) || (firstNumber > 99)) || ((secondNumber < 10) || (secondNumber > 99))) {
            return false;
            // } else return true;
        }
        int secondDigitOfFirstNumber = firstNumber % 10;
        int secondDigitOfSecondNumber = secondNumber % 10;

        int firstDigitOfFirstNumber = firstNumber / 10;
        int firstDigitOfSecondNumber = secondNumber / 10;

        if (firstDigitOfFirstNumber == firstDigitOfSecondNumber 
        || firstDigitOfFirstNumber == secondDigitOfSecondNumber 
        || secondDigitOfFirstNumber == firstDigitOfSecondNumber 
        || secondDigitOfFirstNumber == secondDigitOfSecondNumber) {
            return true;
        } else return false;
    }
}