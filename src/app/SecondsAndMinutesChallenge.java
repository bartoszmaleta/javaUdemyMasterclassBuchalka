package app;

public class SecondsAndMinutesChallenge {
    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {

        String calculatedMinutesAndSeconds = getDurationString(650, 45);
        System.out.println(calculatedMinutesAndSeconds);

        String calculatedMinutesAndSecondsFromSecondsOnly = getDurationString(3945);
        System.out.println(calculatedMinutesAndSecondsFromSecondsOnly);
    }

    public static String getDurationString(int minutes, int seconds) {
        if ((minutes < 0) || (seconds < 0) || (seconds >= 60)) {
            return INVALID_VALUE_MESSAGE;
        }

        // To make seconds like minutes!
        // int secondsToMinutes = seconds / 60;
        // minutes = minutes + secondsToMinutes; # to make seconds like minutes!
        int minutesToHours = minutes / 60;

        int remainingSeconds = seconds % 60;
        int remainingMinutes = minutes % 60;

        String hoursString = minutesToHours + "h ";
        if (minutesToHours < 10) {
            hoursString = "0" + hoursString;
        }

        String minutesString = remainingMinutes + "m ";
        if (remainingMinutes < 10) {
            minutesString = "0" + minutesString;
        }

        String secondsString = remainingSeconds + "s ";
        if (remainingSeconds < 10) {
            secondsString = "0" + secondsString;
        }

        // String resultString = (minutesToHours + "h " + remainingMinutes + "m " + remainingSeconds + "s");
        String resultString = (hoursString + minutesString + secondsString);

        return resultString;

// 
        // if (minutesToHours < 10) {
            // String resultString = ("0" + minutesToHours + "h " + remainingMinutes + "m " + remainingSeconds + "s");
            // return resultString;
// 
        // } else {
            // String resultString = (minutesToHours + "h " + remainingMinutes + "m " + remainingSeconds + "s");
            // return resultString;
        // }
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }

        int minutes = seconds / 60;

        int remainingSeconds = seconds % 60;

        return getDurationString(minutes, remainingSeconds);
    }
}