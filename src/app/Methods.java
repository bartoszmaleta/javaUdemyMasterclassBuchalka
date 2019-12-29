package app;

public class Methods {
    public static void main(String[] args) {
        System.out.println("---------------------------");

        boolean gameOver = true;
        int score = 200;
        int levelCompleted = 6;
        int bonus = 400;

        System.out.println("---------------------------");
        
        calculateScore(gameOver, score, levelCompleted, bonus);

        System.out.println("---------------------------");

        calculateScore(true, 800, 5, 100);

        System.out.println("---------------------------");

        calculateScore(true, 10000, 8, 200);
        
        System.out.println("---------------------------");
    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }   
    }
}