package oopPart2.composition;

// uncomment lines to make it more public!

public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp() {
        // getTheCase().pressPowerButton();
        theCase.pressPowerButton(); 
        drawLogo();
    }

    private void drawLogo() {
        // Fancy graphics
        // getMonitor().drawPixelAt(1200, 50, "yellow"); // or:
        monitor.drawPixelAt(1200, 50, "yellow");
    }

    // public Case getTheCase() {
    //     return theCase;
    // }

    // public Monitor getMonitor() {
    //     return monitor;
    // }

    // public Motherboard getMotherboard() {
    //     return motherboard;
    // }

}