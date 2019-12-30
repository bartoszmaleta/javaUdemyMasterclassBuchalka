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

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Bartosz1500", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Bartosz900", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Bartosz400", highScorePosition);
        
        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Bartosz50", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Bartosz1000", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Bartosz500", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Bartosz100", highScorePosition);

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
        System.out.println(playerName + " managed to get into position " 
        + positionOnHighScoreTable + " on the high score table.");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if ((playerScore >= 500) && (playerScore < 1000)) {
            return 2;
        } else if ((playerScore >= 100) && (playerScore < 500)) {
            return 3;
        } else {
            return 4;
        }
    }
}