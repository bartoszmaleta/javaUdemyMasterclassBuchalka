package controlFlowStatements;

public class NumberPalindrome {
    public static void main(String[] args) {
    
        boolean checkIfNumberIsPalindrome = isPalindrome(121);
        System.out.println(checkIfNumberIsPalindrome);

        boolean checkIfNumberIsPalindrome2 = isPalindrome(-222);
        System.out.println(checkIfNumberIsPalindrome2);

        
    }

    public static boolean isPalindrome (int number) {
        int reverse = 0;
        int startNumber = number;
        
        if (startNumber < 0) {
            startNumber = startNumber * -1;
            number = number * -1;
        }

        while (number > 0) {
            int lastDigit = number % 10;
            reverse = reverse * 10;
            reverse = reverse + lastDigit;
            number = number / 10;
        }
        System.out.println(number);
        System.out.println(reverse);
        System.out.println(startNumber);

        if (startNumber == reverse) {
            return true;
        } else {
            return false;
        }
    }
}