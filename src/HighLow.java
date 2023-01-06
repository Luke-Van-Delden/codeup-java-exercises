import java.util.Scanner;
import java.lang.Math;

public class HighLow {
    public static Scanner scanner = new Scanner(System.in);
    static String doAgain = "";

    public static long setRandom() {
        return (Math.round(Math.random() * 100));
    }

    public static void guessingGame() {
        long randomNumber = setRandom();
        int guessCounter = 0;
        do {
            System.out.println("Guess what number I'm thinking of... 1-100");
            System.out.println(randomNumber);
            int myGuess = scanner.nextInt();
            if (guessCounter == 5) {
                System.out.println("Sorry, you lose! Too many guesses! Want to play again?");
                doAgain = scanner.next();
                if (doAgain.equals("y")) {
                    guessCounter = 0;
                    randomNumber = setRandom();
                }
            } else if (myGuess > randomNumber) {
                System.out.println("LOWER");
                guessCounter++;
                System.out.println("That's " + guessCounter + " guesses. Only " + (5 - guessCounter) + " left!");
            } else if (myGuess < randomNumber) {
                System.out.println("HIGHER");
                guessCounter++;
                System.out.println("That's " + guessCounter + " guesses. Only " + (5 - guessCounter) + " left!");
            } else if (myGuess == randomNumber) {
                System.out.println("Good Guess! Want to play again?");
                doAgain = scanner.next();
                if (doAgain.equals("y")) {
                    guessCounter = 0;
                    randomNumber = setRandom();
                }
            }
        } while (!doAgain.equals("n"));
    }

    public static void main(String[] args) {
        guessingGame();
    }
}
