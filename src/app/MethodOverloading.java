package app;

// MethodOverloading - same method name, but different paramters

public class MethodOverloading {
    public static void main(String[] args) {

        int newScore = calculateScore("Bartosz", 500);
        System.out.println("New score is " + newScore);

        calculateScore(75);

        calculateScore();

        double inchesThirteen = calcFeetAndInchesToCentimeters(13);
        System.out.println(inchesThirteen);

        double inchesAndFeet = calcFeetAndInchesToCentimeters(6, 0);
        System.out.println(inchesAndFeet);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("Unnamed player scored, no player score. ");
        return 0;
    }

    // Wrong! Changing return data type is not enough!
    // public static void calculateScore() {
    // System.out.println("Unnamed player scored, no player score. ");
    // }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet >= 0) {
            feet = feet;
        } else {
            System.out.println("Invalid valid feet or inches");
            return -1;
        }

        if ((inches >= 0) && (inches <= 12)) {
            inches = inches;
        } else {
            System.out.println("Invalid valid feet or inches");
            return -1;
        }

        // ONE LINE CONFIRMATION!!!!
        // if ((feet < 0) || ((inches < 0) || (inches > 12))) {
        // System.out.println("Invalid valid feet or inches");
        // return -1;
        // }

        double feetInInches = feet * 12;

        double resultInCentimeters = (inches + feetInInches) * 2.54;

        System.out.println(feet + " feet, " + inches + " inches " + resultInCentimeters + "cm");
        return resultInCentimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        }

        double feetInInches = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is euqal to " + feetInInches + " feet and " + remainingInches + " inches");
        return calcFeetAndInchesToCentimeters(feetInInches, remainingInches);
    }

}