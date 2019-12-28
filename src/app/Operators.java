package app;

public class Operators {
    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        System.out.println("---------------------------");

        int previousResult = result;
        System.out.println("previousResult = " + previousResult);

        System.out.println("---------------------------");
        
        result = result - 1;
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult = " + previousResult);)
    
        System.out.println("---------------------------");
        
        result = result * 10;
        System.out.println("2 * 10 = " + result);

        System.out.println("---------------------------");

        result = result / 5;
        System.out.println("20 / 5 = " + result);

        System.out.println("---------------------------");

        result = result % 3;
        System.out.println("3 % 3 = " + result);

        System.out.println("---------------------------");

    }
}