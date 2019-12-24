package app;

public class CharAndBoolean {
    public static void main(String[] args) {
        System.out.println("---------------------------");
        
        char myChar = 'D';
        char myUnicodeChar = '\u0044';

        System.out.println(myChar);
        System.out.println(myUnicodeChar);        

        char myCopyrightChar = '\u00A9';
        System.out.println(myCopyrightChar);

        System.out.println("---------------------------");
        
        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        boolean isCustomerOverTwentyOne = true;


    }
}