import java.util.Scanner;
import java.lang.Math;

public class HighLow {
    public static Scanner scanner = new Scanner(System.in);
    static String doAgain = "";
    static int guessCounter = 0;
    static long randomNumb = (Math.round(Math.random() * 100));
    public static void guessingGame() {
        System.out.println("Guess what number I'm thinking of... 1-100");
        long randomNumber = (Math.round(Math.random() * 100));
        guessCounter = 0;
        do {
            System.out.println(randomNumber);
            int myGuess = scanner.nextInt();
            if (guessCounter == 5) {
                System.out.println("Sorry, you lose! Too many guesses! Want to play again?");
                doAgain = scanner.next();
                if (doAgain.equals('y')){
                    guessingGame();
                }
            }
            else if (myGuess > randomNumber) {
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
                if (doAgain.equals('y')){
                    guessingGame();
                }
            }
        } while (!doAgain.equals("n"));
    }
    public static void main(String[] args) {
        guessingGame();
    }
    }
