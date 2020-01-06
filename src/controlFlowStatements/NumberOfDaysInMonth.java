package controlFlowStatements;

public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        boolean checkIfYearIsLeap = isLeapYear(-1600);
        System.out.println(checkIfYearIsLeap);

        boolean checkIfYearIsLeap2 = isLeapYear(1600);
        System.out.println(checkIfYearIsLeap2);

        boolean checkIfYearIsLeap3 = isLeapYear(2017);
        System.out.println(checkIfYearIsLeap3);

        boolean checkIfYearIsLeap4 = isLeapYear(2000);
        System.out.println(checkIfYearIsLeap4);

        System.out.println("-----------------------");

        int daysInMonth = getDaysInMonth(1, 2020);
        System.out.println(daysInMonth);

        int daysInMonth2 = getDaysInMonth(2, 2020);
        System.out.println(daysInMonth2);

        int daysInMonth3 = getDaysInMonth(2, 2018);
        System.out.println(daysInMonth3);

        int daysInMonth4 = getDaysInMonth(-1, 2020);
        System.out.println(daysInMonth4);

        int daysInMonth5 = getDaysInMonth(1, -2020);
        System.out.println(daysInMonth5);

    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year) {
        if ((month < 1) || (month > 12)) {
            return -1;
        }

        if ((year < 1) || (year > 9999)) {
            return -1;
        }

        switch (month) {
        case 1:
            return 31;
        case 2:
            if (isLeapYear(year) == true) {
                return 29;
            } else {
                return 28;
            }
        case 3:
            return 31;
        case 4:
            return 30;
        case 5:
            return 31;
        case 6:
            return 30;
        case 7:
            return 31;
        case 8:
            return 31;
        case 9:
            return 30;
        case 10:
            return 31;
        case 11:
            return 30;
        case 12:
            return 31;
        default:
            return -1;
        }
    }
}