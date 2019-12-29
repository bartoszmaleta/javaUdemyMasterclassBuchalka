package app;

public class Methods2 {
    public static void main(String[] args) {
        System.out.println("---------------------------");

        boolean gameOver = true;
        int score = 200;
        int levelCompleted = 6;
        int bonus = 400;

        System.out.println("---------------------------");
        
        calculateScore(gameOver, score, levelCompleted, bonus);

        System.out.println("---------------------------");

        gameOver = true;
        score = 1000;
        levelCompleted = 4;
        bonus = 200;

        calculateScore(gameOver, score, levelCompleted, bonus);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);

            return finalScore;
        // } return -1;     // ANOTHER OPTION
        }  else {
            return -1;
        }
    }
}