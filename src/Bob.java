import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Beginning teenager simulation:\nWhat would you like to say to Bob? ");

        String userInput = scanner.nextLine();
        do {
            if (userInput.endsWith("?")) {
                System.out.println("Sure");
            } else if (userInput.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (userInput.equals("")) {
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Whatever.");
            }
            System.out.println("Are we done talking yet?");
            userInput = scanner.nextLine();
            userInput = userInput.toLowerCase();
        } while (!userInput.contains("yes"));
        System.out.println("Sheesh, thank goodness. You are so boring!");
    }
}
