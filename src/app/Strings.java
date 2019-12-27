package app;

public class Strings {
    public static void main(String[] args) {
        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);

        myString = myString + ", and this is more.";
        System.out.println("myString is euqal to " + myString);

        System.out.println("---------------------------");

        myString = myString + " \u00A9 2019";
        System.out.println("myString is equal to " + myString);

        System.out.println("---------------------------");

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);

        System.out.println("---------------------------");

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString is equal to " + lastString);

        System.out.println("---------------------------");
        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("LastString is equal to " + lastString);

    }
}