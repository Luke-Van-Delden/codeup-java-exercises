import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.format("The value of pi is %.2f \n", pi);

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter something: ");
//        int userInput = scanner.nextInt();
//
//        System.out.println("You entered: --> \"" + userInput + "\" <--");
        Scanner threeWords = new Scanner(System.in);

        System.out.println("Enter 3 Words: ");
        String first = threeWords.next();
        String second = threeWords.next();
        String third = threeWords.next();

//        System.out.printf("First: %s, Second: %s, Third: %s", first, second, third);

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);

        Scanner sentence = new Scanner(System.in);

        System.out.println("Write out a sentence: ");

        String whole = sentence.nextLine();

        System.out.printf("%s", whole);
    }
}
