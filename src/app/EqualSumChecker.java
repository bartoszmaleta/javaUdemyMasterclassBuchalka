package app;

public class EqualSumChecker {
    public static boolean hasEqualSum(int firstNumber, int secondNumber, int thirdNumber) {
        int sumOfFirstAndSecond = firstNumber + secondNumber;

        if (sumOfFirstAndSecond == thirdNumber) {
            return true;
        } else { 
            return false;
        }
    }
    
    public static void main(String[] args) { 
    boolean sumOfOnesResultOne = hasEqualSum(1, 1, 1);
    System.out.println(sumOfOnesResultOne);

    boolean sumOfOnesResultTwo = hasEqualSum(1, 1, 2);
    System.out.println(sumOfOnesResultTwo);

    boolean sumOfOneAndMinusOneResultZero = hasEqualSum(1, -1, 0);
    System.out.println(sumOfOneAndMinusOneResultZero);

    }
}