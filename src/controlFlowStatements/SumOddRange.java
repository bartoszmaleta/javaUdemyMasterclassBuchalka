package controlFlowStatements;

public class SumOddRange {
    public static void main(String[] args) {

        int sumOfOddNumbers = sumOdd(1, 100);
        System.out.println(sumOfOddNumbers);
        
        int sumOfOddNumbers2 = sumOdd(-1, 100);
        System.out.println(sumOfOddNumbers2);
    
        int sumOfOddNumbers3 = sumOdd(100, 100);
        System.out.println(sumOfOddNumbers3);
    
        int sumOfOddNumbers4 = sumOdd(13, 13);
        System.out.println(sumOfOddNumbers4);
    
        int sumOfOddNumbers5 = sumOdd(1, -100);
        System.out.println(sumOfOddNumbers5);
    
        int sumOfOddNumbers6 = sumOdd(100, 1000);
        System.out.println(sumOfOddNumbers6);
    }

    public static boolean isOdd (int number) {
        if (number < 0) {
            return false;
        }

        if (number % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int sumOdd(int start, int end) {
        if ((end < start) || (start < 0) || (end < 0)) {
            return -1;
        } 
        
        int sumOfOddNumbers = 0;
        int counter = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sumOfOddNumbers += i;
            }
        }


        return sumOfOddNumbers;
    }
}