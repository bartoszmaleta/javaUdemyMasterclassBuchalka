package app;

public class PlayingCat {
    public static void main(String[] args) {
        boolean checkIfCatPlays = isCatPlaying(true, 33);
        System.out.println(checkIfCatPlays);

        boolean checkIfCatPlays2 = isCatPlaying(true, 10);
        System.out.println(checkIfCatPlays2);

        boolean checkIfCatPlays3 = isCatPlaying(false, 36);
        System.out.println(checkIfCatPlays3);

        boolean checkIfCatPlays4 = isCatPlaying(false, 35);
        System.out.println(checkIfCatPlays4);

        boolean checkIfCatPlays5 = isCatPlaying(false, 10);
        System.out.println(checkIfCatPlays5);
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {

        if (summer == true) {
            if (temperature >= 25 && temperature <= 45) {
                return true;
            } else {
                return false;
            }
        } else {
            if (temperature >= 25 && temperature <= 35) {
                return true;
            } else {
                return false;
            }
        }
    }
}