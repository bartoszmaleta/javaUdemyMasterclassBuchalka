package controlFlowStatements;

public class ForStatement {
    public static void main(String[] args) {
        System.out.println("10, 000 at 2% interest = " + calculateInterest(10000.0, 2.0));
        System.out.println("10, 000 at 2% interest = " + calculateInterest(10000.0, 3.0));
        System.out.println("10, 000 at 2% interest = " + calculateInterest(10000.0, 4.0));
        System.out.println("10, 000 at 2% interest = " + calculateInterest(10000.0, 5.0));

        // for (init; termination; increment) {}

        System.out.println("-----------------------");
        for (int i = 2; i <= 8; i++) {
            System.out.println("10, 000 at " + i + " interest = " + calculateInterest(10000.0, i));
        }

        System.out.println("-----------------------");
        for (int i = 1; i < 5; i++) {
            System.out.println("Loop " + i + " hello!");
        }

        System.out.println("-----------------------");
        for (int i = 2; i <= 8; i++) {
            System.out
                    .println("10, 000 at " + i + " interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }

        System.out.println("-----------------------");
        for (int i = 8; i >= 2; i--) {
            System.out
                    .println("10, 000 at " + i + " interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }

        System.out.println("-----------------------");
        printPrimeNumbers();
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        // for (int i = 2; i <= n / 2; i++) {               // also goo version
        for (int i = 2; i <= (long) Math.sqrt(n); i++) {    // more optimalization
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printPrimeNumbers() {
        int counter = 0;
        for (int x = 10; x < 50; x++) {
            System.out.println(x);
            if (isPrime(x)) {
                System.out.println("Number " + x + " is a prime number");
                counter++;
            }
            if (counter == 3) {
                System.out.println("Exiting for loop, and counter is = " + counter);
                break;
            }
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return ((amount * (interestRate / 100)));
    }
}