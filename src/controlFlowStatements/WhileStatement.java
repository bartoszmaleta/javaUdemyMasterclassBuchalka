package controlFlowStatements;

public class WhileStatement {

    public static void main(String[] args) {
        int count = 0;
        
        System.out.println("--------------------------- WHILE LOOP");

        while (count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }

        System.out.println("--------------------------- FOR LOOP");


        for (int i = 0; i < 6; i++) {
            System.out.println("Count value is " + i);
        }

        System.out.println("--------------------------- ANOTHER WHILE LOOP");
        count = 0;
        while (true) {
            if (count == 6) {
                break;
            } 
            System.out.println("Count value is " + count);
            count++;
        }
        System.out.println("--------------------------- DO WHILE LOOP");

        count = 1;
        do {
            System.out.println("Count value was " + count);
            count++;
        } while (count != 6);

        System.out.println("--------------------------- DO WHILE LOOP ALMOST INFINITE");

        count = 6;
        do {
            System.out.println("Count value was " + count);
            count++;
            if (count > 100) {
                break;
            }
        } while (count != 6);

        System.out.println("--------------------------- Challenge");
        System.out.println("Even numbers ");
        
        int number = 4;
        int finishNumber = 20;
        
        while (number <= finishNumber) { 
            number ++;
            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number " + number);
        }

        System.out.println("--------------------------- Challenge with break");
        System.out.println("Even numbers ");
        
        int number2 = 4;
        int finishNumber2 = 20;
        
        int counterOfEvenNumbers = 0;
        while (number2 <= finishNumber2) { 
            number2 ++;
            if (!isEvenNumber(number2)) {
                continue;
            }
            counterOfEvenNumbers ++;
            System.out.println("Even number " + number2);
            if (counterOfEvenNumbers == 5) {
                break;
            }
        }
        System.out.println("Number of even numbers: " + counterOfEvenNumbers);
    }

    public static boolean isEvenNumber(int number) {
        if ((number % 2) == 0) {
            return true;
        } else {
            return false;
        }

    }
} 