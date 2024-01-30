import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class QuizApplication {
    private static int score = 0;
    private static boolean timeUp = false;
    private static Scanner scanner = new Scanner(System.in);
    private static Timer timer = new Timer();

    public static void main(String[] args) {
        System.out.println("Welcome to Quiz");

        askQuestion("What is the capital of India?",
                new String[] { "a) Mumbai", "b) New Delhi", "c) Kolkata", "d) Chennai" }, "b", 10);
        askQuestion("Multiplication of 5*3 is?", new String[] { "a) 15", "b) 8", "c) 3", "d) 10" }, "a", 10);
        askQuestion("Which is the largest planet in the solar system?",
                new String[] { "a) Mercury", "b) Venus", "c) Jupiter", "d) Saturn" }, "c", 10);
        askQuestion("Who is the first president?", new String[] { "a) George Washington", "b) Abraham Lincoln",
                "c) Thomas Jefferson", "d) George H. W. Bush" }, "a", 10);
        askQuestion("Who is the father of the Indian constitution?", new String[] { "a) B.R. Ambedkar",
                "b) Mahatma Gandhi", "c) Jawaharlal Nehru", "d) Subhas Chandra Bose" }, "a", 10);
        askQuestion("Who discovered zero(0)?",
                new String[] { "a) Isaac Newton", "b) Albert Einstein", "c) Aryabhata", "d) Galileo Galilei" }, "c",
                10);
        askQuestion("What is the square root of 64?", new String[] { "a) 8", "b) 6", "c) 10", "d) 4" }, "a", 10);

        displayScore();

        scanner.close();
    }

    public static void askQuestion(String question, String[] options, String correctAnswer, int timeInSeconds) {
        if (!timeUp) {
            System.out.println(question);
            for (String option : options) {
                System.out.println(option);
            }

            System.out.print("Your answer: ");
            char userAnswer = scanner.next().charAt(0);
            checkAnswer(userAnswer, correctAnswer);

            // Start the timer after user inputs their answer
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    System.out.println("Time up!");
                    timeUp = true;
                    displayScore();
                }
            }, timeInSeconds * 1000);

            // Cancel the timer if user inputs the answer before time ends
            if (!timeUp) {
                timer.schedule(new TimerTask() {
                    @Override
                    public void run() {
                        timer.cancel();
                    }
                }, timeInSeconds * 1000);
            }
        }
    }

    public static void checkAnswer(char userAnswer, String correctAnswer) {
        if (userAnswer == correctAnswer.charAt(0)) {
            score++;
        }
    }

    public static void displayScore() {
        System.out.println("Your score: " + score);
    }
}
