package app;

public class Methods2 {
    public static void main(String[] args) {
        System.out.println("---------------------------");

        boolean gameOver = true;
        int score = 200;
        int levelCompleted = 6;
        int bonus = 400;

        System.out.println("---------------------------");
        
        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        System.out.println("---------------------------");

        gameOver = true;
        score = 1000;
        levelCompleted = 4;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        System.out.println("---------------------------");

        displayHighScorePosition("Bartosz", 6);

        calculateHighScorePosition(1500);
        calculateHighScorePosition(900);
        calculateHighScorePosition(400);
        calculateHighScorePosition(50);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;

            return finalScore;
        // } return -1;     // ANOTHER OPTION
        }  else {
            return -1;
        }
    }
    
    public static void displayHighScorePosition(String playerName, int positionOnHighScoreTable) {
        System.out.println(playerName + " managed to get into position " + positionOnHighScoreTable + " on the high score table.");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore > 1000) {
            return 1;
        } else if ((playerScore > 500) && (playerScore < 1000)) {
            return 2;
        } else if ((playerScore > 100) && (playerScore < 500)) {
            return 3;
        } else {
            return 4;
        }
    }
}