package controlFlowStatements;

public class ParsingStrings {
    public static void main(String[] args) {
        System.out.println("------------------------ Integer parsing");

        String numberAsString = "2018";
        System.out.println("numberAsString = " + numberAsString);

        int number = Integer.parseInt(numberAsString);
        System.out.println("Number = " + number);

        System.out.println("------------------------ Integer parsing");

        numberAsString += 1;
        number += 1;

        System.out.println("numberAsString = " + numberAsString);
        System.out.println("Number = " + number);

        System.out.println("------------------------ Double");

        String numberAsString2 = "2018.125";
        System.out.println("numberAsString2 = " + numberAsString2);

        double numberInDouble = Double.parseDouble(numberAsString2);
        System.out.println("Number = " + numberInDouble);

        System.out.println("------------------------ Double");
        numberAsString2 += 1;
        numberInDouble += 1;

        System.out.println("numberAsString2 = " + numberAsString2);
        // numberInDouble = Double.parseDouble(numberAsString);
        System.out.println("Number = " + numberInDouble);

    }
}