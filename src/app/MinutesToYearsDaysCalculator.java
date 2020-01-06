package app;

public class MinutesToYearsDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            int hours = (int) minutes / 60;
            long remainingMinutes = minutes % 60;
            int days = hours / 24;
            int remainingHours = hours % 24;

            int years = days / 365;
            int remainingDays = days % 365;

            String finalMessage = (minutes + " min = " + years + " y and " + remainingDays + " d");
            System.out.println(finalMessage);
        }
    }
}