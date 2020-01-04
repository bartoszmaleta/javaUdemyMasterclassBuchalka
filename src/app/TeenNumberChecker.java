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
        if ((ageOfTeen >= 13) && (ageOfTeen <= 19)) {
            return true;
        } else {
            return false;
        }
        
        // return true;
    }

    public static void main(String[] args) {
        boolean checkingIfHasTeen = hasTeen(9, 99, 19);
        System.out.println(checkingIfHasTeen);

        boolean checkingIfHasTeen2 = hasTeen(23, 15, 42);
        System.out.println(checkingIfHasTeen2);

        boolean checkingIfHasTeen3 = hasTeen(22, 23, 34);
        System.out.println(checkingIfHasTeen3);

        boolean checkIfIsTeen = isTeen(9);
        System.out.println(checkIfIsTeen);

        boolean checkIfIsTeen2 = isTeen(13);
        System.out.println(checkIfIsTeen2);


    }
}