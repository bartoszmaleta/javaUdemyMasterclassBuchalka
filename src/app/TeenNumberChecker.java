package app;

public class TeenNumberChecker {
    public static boolean hasTeen(int firstNumber, int secondNumber, int thirdNumber) {
        if ((firstNumber >= 13) && (firstNumber <= 19) || (secondNumber >= 13) && (secondNumber<= 19) || (thirdNumber >= 13) && (thirdNumber <= 19)) {
            // System.out.println("True");
            return true;
        } else {
            return false;
        }
    }

    public static boolean isTeen(int ageOfTeen) {
        
        
        return true;
    }

    public static void main(String[] args) {
        boolean checkingAge = hasTeen(9, 99, 19);
        System.out.println(checkingAge);

        boolean checkingAge2 = hasTeen(23, 15, 42);
        System.out.println(checkingAge2);

        boolean checkingAge3 = hasTeen(22, 23, 34);
        System.out.println(checkingAge3);

    }
}