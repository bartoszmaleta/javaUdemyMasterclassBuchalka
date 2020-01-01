package app;

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        }
        
        int calculatedMegaBytes = kiloBytes / 1000;
        System.out.println(calculatedMegaBytes);

        int remainingKilobytes = kiloBytes - (calculatedMegaBytes * 1000);
        System.out.println(remainingKilobytes);



    }

    public static void main(String[] args) {

        printMegaBytesAndKiloBytes(2500);
    }
 
}