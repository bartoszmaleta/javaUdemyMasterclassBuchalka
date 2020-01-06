package app;

public class SecondsAndMinutesChallenge {
    public static void main(String[] args) {

        String calculatedMinutesAndSeconds = getDurationString(65, 45);
        System.out.println(calculatedMinutesAndSeconds);

        String calculatedMinutesAndSecondsFromSecondsOnly = getDurationString(3945);
        System.out.println(calculatedMinutesAndSecondsFromSecondsOnly);
    }

    public static String getDurationString(int minutes, int seconds) {
        if ((minutes < 0) || (seconds < 0) || (seconds >= 60)) {
            String invalidValueMessage = "Invalid values";
            return invalidValueMessage;
        }

        // To make seconds like minutes!
        // int secondsToMinutes = seconds / 60;
        // minutes = minutes + secondsToMinutes; # to make seconds like minutes!
        int minutesToHours = minutes / 60;

        int remainingSeconds = seconds % 60;
        int remainingMinutes = minutes % 60;

        if (minutesToHours < 10) {
            String resultString = ("0" + minutesToHours + "h " + remainingMinutes + "m " + remainingSeconds + "s");
            return resultString;

        } else {
            String resultString = (minutesToHours + "h " + remainingMinutes + "m " + remainingSeconds + "s");
            return resultString;
        }
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            String invalidValueMessage = "Invalid values";
            return invalidValueMessage;
        }

        int minutes = seconds / 60;

        int remainingSeconds = seconds % 60;

        return getDurationString(minutes, remainingSeconds);
    }
}