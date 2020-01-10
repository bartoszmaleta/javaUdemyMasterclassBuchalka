package oopPart2.encapsulation.EncapsulationChallenge93;

public class MainPrinter {
    public static void main(String[] args) {
        Printer printer = new Printer(40, 4, true);

        printer.fillUpTheToner(20);
        printer.printingAPage();
    }
}