import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class QuizApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;

        System.out.println("Welcome to Quiz");
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            public void run() {
                System.out.println(" Time up!");
                System.exit(0);

            }

        }, 30000);

        System.out.println(" Que 1 : what is the captical of India?");
        System.out.println("a) Mumbai");
        System.out.println("b) Delhi");
        System.out.println("c) Pune");
        System.out.println("d) Kolkata");
        char ans1 = sc.next().charAt(0);

        System.out.println(" Que 2 : multiplication of 5*3 is  ?");
        System.out.println("a) 4");
        System.out.println("b) 2");
        System.out.println("c) 15");
        System.out.println("d) 8");
        char ans2 = sc.next().charAt(0);

        System.out.println(" Que 3 : which is the largest planet in solar system?");
        System.out.println("a) Earth");
        System.out.println("b) Mars");
        System.out.println("c) Jupiter");
        System.out.println("d) Saturn");
        char ans3 = sc.next().charAt(0);

        System.out.println(" Que 4 : who is the first president?");
        System.out.println("a) Mahatama Gandhi");
        System.out.println("b)  Dr.B.R.Ambedkar");
        System.out.println("c) Pandit Jawaharlal Nehru");
        System.out.println("d) Dr.Rajendra Prasad");
        char ans4 = sc.next().charAt(0);

        System.out.println(" Que 5 : who is the father of indian constitution?");
        System.out.println("a) Dr.B.R.Ambedkar");
        System.out.println("b) Jotiba Phule");
        System.out.println("c) Pandit Jawaharlal Nehru");
        System.out.println("d) Mahatama Gandhi");
        char ans5 = sc.next().charAt(0);

        System.out.println(" Que  6 : who discoverd zero(0)?");
        System.out.println("a) Albert Einstein");
        System.out.println("b) Archimedes");
        System.out.println("c) Aryabhatta");
        System.out.println("d) John Wallis");
        char ans6 = sc.next().charAt(0);

        timer.cancel();
        switch (ans1) {
            case 'b':
                score++;
                break;
            default:
                break;
        }
        switch (ans2) {
            case 'c':
                score++;
                break;
            default:
                break;
        }
        switch (ans3) {
            case 'b':
                score++;
                break;
            default:
                break;
        }
        switch (ans4) {
            case 'd':
                score++;
                break;
            default:
                break;
        }
        switch (ans5) {
            case 'a':
                score++;
                break;
            default:
                break;
        }
        switch (ans6) {
            case 'c':
                score++;
                break;
            default:
                break;
        }
        displayScore(score);
    }

    public static void displayScore(int score) {
        System.out.println(" your score : " + score);
    }

}
