package L4_MethodsRelatedConcepts;

public class L1Methods {
    public static void main(String[] args) {

        //! This is more readable (Depends on the companies standard)
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("High Score: " + highScore);

        //! OR
        System.out.println("Next High Score: " + calculateScore(true, 10000, 8, 200));

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        int finalScore = score;
        if (gameOver) {
            finalScore += (levelCompleted * bonus);
        }
        return finalScore;
    }
}

/*
we can have multiple methods with the same method name, as long as the parameters are different.
In many languages, methods can be defined with default values, and we can omit passing values for these when calling the method. But java does not support this.
  */
