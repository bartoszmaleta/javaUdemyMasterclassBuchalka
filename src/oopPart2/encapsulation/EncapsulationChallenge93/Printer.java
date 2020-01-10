package oopPart2.encapsulation.EncapsulationChallenge93;

public class Printer {
    private int tonerLever;
    private int numberOfPagesPrinted;
    private boolean duplexPrinter;

    public Printer(int tonerLever, int numberOfPagesPrinted, boolean duplexPrinter) {

        if (tonerLever > 0 && tonerLever <= 100) {
            this.tonerLever = tonerLever;
        }
        this.numberOfPagesPrinted = numberOfPagesPrinted;
        this.duplexPrinter = duplexPrinter;
    }

    
}