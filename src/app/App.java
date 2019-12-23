package app;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Bartosz");

        int myFirstNumber = (10 + 5) + (2 * 10);
        
        System.out.println("myFirstNumber");
        System.out.println(myFirstNumber);

        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber * 2;

        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;

        System.out.println(myTotal);

        int myLastOne = myTotal - 1000;
        System.out.println(myLastOne);

    }
}