package controlFlowStatements;

public class WhileStatement {

    public static void main(String[] args) {
        int count = 0;
        
        while (count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }

        System.out.println("---------------------------");


        for (int i = 0; i < 6; i++) {
            System.out.println("Count value is " + i);
        }

        System.out.println("---------------------------");

        count = 0;
        while (true) {
            if (count == 6) {
                break;
            } 
            System.out.println("Count value is " + count);
            count++;

        }

    }
}