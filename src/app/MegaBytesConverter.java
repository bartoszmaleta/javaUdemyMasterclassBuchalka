package app;

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {

            int remainingKilobytes = kiloBytes % 1024;
            // System.out.println(remainingKilobytes);

            int calculatedMegaBytes = (kiloBytes - remainingKilobytes) / 1000;
            // System.out.println(calculatedMegaBytes);

            System.out.println(kiloBytes + " KB = " + calculatedMegaBytes + " MB and " + remainingKilobytes + " KB");
        }
    }

    public static void main(String[] args) {

        printMegaBytesAndKiloBytes(5000);
    }

}