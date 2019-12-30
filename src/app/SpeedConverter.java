package app;

public class SpeedConverter {

    // TESTING FUNCTION
    // public static void main(String[] args) {
    //     toMilesPerHour(75.114);
    // }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }

        double calculatedMiles = kilometersPerHour / 1.609;
        long roundedMiles = Math.round(calculatedMiles);
        // System.out.println(roundedMiles);  // redundat, just for test in main
        return roundedMiles;

        // ONE LINE SOLUTION:
        // return Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid value");
        } else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " +  milesPerHour + " mi/h");
        }
     }
}