package app;

public class LeapYear {
    public static boolean isLeapYear(int year) {
        // boolean isLeapYear = false;
        if (year >= 1 && year <= 9999) {
            // code
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        // System.out.println("leap year");
                        return true;
                    } else {
                        return false;
                    }
                } else {
                    // System.out.println("leap year");
                    return true;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        boolean leapYear = isLeapYear(-1200);

        System.out.println(leapYear);
    }
}