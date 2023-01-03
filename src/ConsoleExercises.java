import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
//        Formatting to 2 decimal places
//        double pi = 3.14159;
//        System.out.format("The value of pi is %.2f \n", pi);

//          Taking in an integer
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter something: ");
//        int userInput = scanner.nextInt();
//
//        System.out.println("You entered: --> \"" + userInput + "\" <--");

//        Taking in 1 word string at a time
//        Scanner threeWords = new Scanner(System.in);
//
//        System.out.println("Enter 3 Words: ");
//        String first = threeWords.next();
//        String second = threeWords.next();
//        String third = threeWords.next();

//        System.out.printf("First: %s, Second: %s, Third: %s", first, second, third);

//        System.out.println(first);
//        System.out.println(second);
//        System.out.println(third);
//

//        Taking in  a whole sentence
//        Scanner sentence = new Scanner(System.in);
//
//        System.out.println("Write out a sentence: ");
//
//        String whole = sentence.nextLine();
//
//        System.out.printf("%s", whole);

        Scanner lengthGet = new Scanner(System.in);

                System.out.println("Enter the length of room: ");
        String length = lengthGet.nextLine();

        Scanner widthGet = new Scanner(System.in);

        System.out.println("Enter the length of room: ");
        String width = widthGet.nextLine();
        int l = Integer.parseInt(length);
        int w = Integer.parseInt(width);
//        public static int parseInt(String width);

        System.out.println("Length: " + l + " and width: " + w);
        System.out.println("Area of Room = " + l*w);
        System.out.println("Perimeter of room = " + (2*l + 2*w));


    }
}
