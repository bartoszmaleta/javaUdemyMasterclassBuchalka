package oopPart2.encapsulation.EncapsulationChallenge93;

public class Printer {
    private int tonerLever;
    private int numberOfPagesPrinted;
    private boolean duplexPrinter;

    public Printer(int tonerLever, int numberOfPagesPrinted, boolean duplexPrinter) {
        if (tonerLever >= 0 && tonerLever <= 100) {
            this.tonerLever = tonerLever;
        } else {
            this.tonerLever = -1; 
        }
        this.numberOfPagesPrinted = 0;
        this.duplexPrinter = duplexPrinter;
    }

    // better version of "fillUpTheToner()" !!!!!!!!!!!!
    public int addToner(int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <= 100) {
            if (this.tonerLever + tonerAmount > 100) {
                return -1;
            } else {
                this.tonerLever += tonerAmount;
                return this.tonerLever;
            }
        } else {
            return -1;
        }
    }

    public int printPages(int pages) {
        int pagesToPrint = pages;
        if (this.duplexPrinter) {
            pagesToPrint = pages / 2 + (pages % 2);
            System.out.println("Printing in duplex mode");
        }
        this.numberOfPagesPrinted += pagesToPrint;
        return pagesToPrint;
    }
     

    public void fillUpTheToner(int fill) {
        System.out.println("Your tonerLevel is at = " + this.tonerLever);
        System.out.println("You are going to fill toner by " + fill);

        this.tonerLever = this.tonerLever + fill;
        if (this.tonerLever > 100) {
            this.tonerLever = 100;
        }
        System.out.println("Your tonerLevel is at = " + this.tonerLever);
    }

    public void printingAPage() {
        System.out.println("As of now, number of pages printed = " + numberOfPagesPrinted);
        this.numberOfPagesPrinted = this.numberOfPagesPrinted + 1;
        System.out.println("As of now, number of pages printed = " + numberOfPagesPrinted);
     }

    public int getNumberOfPagesPrinted() {
        return numberOfPagesPrinted;
    }

}