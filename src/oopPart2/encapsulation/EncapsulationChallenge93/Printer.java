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

    public void fillUpTheToner(int fill) {
        System.out.println("Your tonerLevel is at = " + this.tonerLever);
        System.out.println("You are going to fill toner by " + fill);

        this.tonerLever = this.tonerLever + fill;
        if (this.tonerLever == 0) {
            this.tonerLever = 100;
        }
        System.out.println("Your tonerLevel is at = " + this.tonerLever);
    }

    public int getTonerLever() {
        return tonerLever;
    }

    public void setTonerLever(int tonerLever) {
        this.tonerLever = tonerLever;
    }

    public int getNumberOfPagesPrinted() {
        return numberOfPagesPrinted;
    }

    public void setNumberOfPagesPrinted(int numberOfPagesPrinted) {
        this.numberOfPagesPrinted = numberOfPagesPrinted;
    }

    public boolean isDuplexPrinter() {
        return duplexPrinter;
    }

    public void setDuplexPrinter(boolean duplexPrinter) {
        this.duplexPrinter = duplexPrinter;
    }

    

    
}