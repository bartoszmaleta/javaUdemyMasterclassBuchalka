package controlFlowStatements;

public class Switch {
    public static void main(String[] args) {
        int value = 1;

        if (value == 1) {
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Was not 1 or 2");
        }

        System.out.println("======== SWITCH ============");

        int switchValue = 3;

        switch (switchValue) {
        case 1:
            System.out.println("Value was 1");
            break;

        case 2:
            System.out.println("Value was 2");
            break;

        case 4:
        case 3:
        case 5:
            System.out.println("was a 3, or a 4, or a 5");
            System.out.println("Acutally it was a " + switchValue);
            break;

        default:
            System.out.println("Was not 1 or 2");
            break;
        }
        // more code here, after break

        System.out.println("======== SWITCH char - challenge ============");

        char charVariable = 'D';
        switch (charVariable) {
        case 'A':
            System.out.println("A was  found");
            break;
        case 'B':
            System.out.println("B was  found");
            break;
        case 'C':
        case 'D':
        case 'E':
            System.out.println("Was a C/D/E");
            System.out.println(charVariable + " was found");
            break;
        default:
            System.out.println("Could not find A/B/C/D/E");
        }

        System.out.println("======== SWITCH caseSensitive ============");


        String month = "January";
        switch(month.toLowerCase()) {
            case "january":
            System.out.println("Jan");
            break;
            case "june":
            System.out.println("Jun");
            break;
            default: System.out.println("Not sure");
        }
    }
}