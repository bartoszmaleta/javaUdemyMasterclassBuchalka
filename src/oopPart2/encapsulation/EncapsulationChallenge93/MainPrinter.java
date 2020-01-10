package oopPart2.encapsulation.EncapsulationChallenge93;

public class MainPrinter {
    public static void main(String[] args) {
        Printer printer = new Printer(40, 4, true);

        printer.fillUpTheToner(20);
        printer.printingAPage();

        System.out.println("-------------------");
        // -------------------- Alternative version
        Printer printer2 = new Printer(50, 15, false); // default win, why???
        System.out.println("Initial page count = " + printer2.getNumberOfPagesPrinted());
        int pagesPrinted = printer2.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer2.getNumberOfPagesPrinted());

        pagesPrinted = printer2.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer2.getNumberOfPagesPrinted());

    }
    
    
}