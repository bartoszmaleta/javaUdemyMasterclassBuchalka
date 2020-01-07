package controlFlowStatements;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }

        int factor = 0;
        int sumOfFacotrs = 0;

        while (sumOfFacotrs < number) {
            factor++;
            if (number % factor == 0) {
                System.out.println(factor);
                sumOfFacotrs += factor;
                System.out.println(sumOfFacotrs);
            }
            if (sumOfFacotrs == number) {
                return true;
            }
        }
        System.out.println(sumOfFacotrs);
        return false;
    }
}