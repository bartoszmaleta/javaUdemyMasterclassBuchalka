package app;

public class HelloWorld {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Bartosz");

        int myFirstNumber = (10 + 5) + (2 * 10);
        
        System.out.println("myFirstNumber");
        System.out.println(myFirstNumber);

        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber * 2;

        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;

        System.out.println(myTotal);

        int myLastOne = 1000 - myTotal;
        System.out.println(myLastOne);

    } 
}