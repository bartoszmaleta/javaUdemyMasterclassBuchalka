package app;

public class Operators {
    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        System.out.println("---------------------------");

        int previousResult = result;
        System.out.println("previousResult = " + previousResult);

        System.out.println("---------------------------");
        
        result = result - 1;
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult = " + previousResult);
    
        System.out.println("---------------------------");
        
        result = result * 10;
        System.out.println("2 * 10 = " + result);

        System.out.println("---------------------------");

        result = result / 5;
        System.out.println("20 / 5 = " + result);

        System.out.println("---------------------------");

        result = result % 3;
        System.out.println("3 % 3 = " + result);

        System.out.println("---------------------------"); 

        boolean isAlien = false;
        if (isAlien == true)
            System.out.println("It is not an alien!");      // just first line will be under if statement
            System.out.println("Alien attacks");

        System.out.println("---------------------------");

        int topScore = 100;
        if (topScore >= 100) {       // OPTIONS:    >=, <, <=, ==, !=
            System.out.println("You got the high score!");
        }

        System.out.println("---------------------------");
        
        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore >= 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        System.out.println("---------------------------");

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");

        }

        System.out.println("---------------------------");

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        System.out.println("---------------------------");

        boolean isCar = false;
        if (isCar == true) {
            System.out.println("This is not supposed to happen");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;
        // means is isCar equal to true? 
        // if it is, i wanna set our wasCar variable to true
        // otherwise set to false 
        if (wasCar) {
            System.out.println("wasCar is true");
        }

        System.out.println("---------------------------");

        int ageOfClient = 20;
        boolean isEighteenOrOver = ageOfClient == 20 ? true : false;

        if (isEighteenOrOver == true) {
            System.out.println("Over 18");
        }

        System.out.println("---------------------------");

        double myDouble = 20.00d;
        double mySecondDouble = 80.00d;
        double resultDouble = (myDouble + mySecondDouble) * 100.00d;
        System.out.println("MyValuesTotal = " + resultDouble);
        
        double moduleResult = resultDouble % 40.00d;
        System.out.println("The remainder = " + moduleResult);

        boolean isNoRemainder = (moduleResult == 0) ? true : false;
        System.out.println("isNoRemainder = " + isNoRemainder);

        if (!isNoRemainder) {
            System.out.println("Got some remainder");
        }

        System.out.println("---------------------------");

    }
}