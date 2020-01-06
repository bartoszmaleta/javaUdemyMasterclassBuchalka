package controlFlowStatements;

public class ForExerciseWithSum {
    public static void main(String[] args) {
        int counter = 0;
        int sumOfNumbersWhichMetConditions = 0;
        for (int i = 1; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("Number met condintions, and it is = " + i);
                sumOfNumbersWhichMetConditions += i;
                counter += 1;
            }
            if (counter == 5) {
                break;
            }
        }
        System.out.println("Sum = " + sumOfNumbersWhichMetConditions);
    }
}