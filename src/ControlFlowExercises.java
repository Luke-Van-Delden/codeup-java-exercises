import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

//        int i = 5;
//        while (i <=15){
//            System.out.print(i + " ");
//            i++;
//        }

//        int x = 0;
//        do {
//            System.out.println(x);
//            x += 2;
//        } while (x <= 100);

//        int x = 100;
//        do {
//            System.out.println(x);
//            x -= 5;
//        } while (x >= -10);

//        long x = 2;
//        do {
//            System.out.println(x);
//            x = x * x;
//        } while (x < 1000000);

        //        for (int i = 5; i <= 15; i++) {
//            System.out.print(i + " ");
//        }

//        for ( int i = 0; i <=100; i+=2){
//            System.out.println(i);
//        }

//        for ( int i = 100; i >= -10; i-=5){
//            System.out.println(i);
//        }

//        for (long i = 2; i < 1000000; i*=i){
//            System.out.println(i);
//        }

//        for(int i = 0; i <= 100; i++) {
//            if (i > 0) {
//                if ((i % 3 == 0) && (i % 5 == 0)) {
//                    System.out.println("FizzBuzz");
//                } else if (i % 3 == 0) {
//                    System.out.println("Fizz");
//                } else if (i % 5 == 0) {
//                    System.out.println("Buzz");
//                } else {
//                    System.out.println(i);
//                }
//            }
//            else{
//                System.out.println(i);
//            }
//        }

//        Scanner scanner = new Scanner(System.in);
//        String doAgain = "";
//        do {
//            System.out.print("What number would you like to go up to? ");
//            String userInput = scanner.next();
//            int number = Integer.parseInt(userInput);
//
//            System.out.println("\nHere is your table!");
//
//            System.out.println("\nnumber | squared | cubed\n------ | ------- | -----");
//            for (int i = 1; i <= number; i++) {
//                if (i * i < 10) {
//                    System.out.println(i + "      | " + i * i + "       | " + i * i * i);
//                } else {
//                    System.out.println(i + "      | " + i * i + "      | " + i * i * i);
//                }
//            }
//            scanner.nextLine();
//            System.out.println("Would you like to continue? (y/n)");
//            doAgain = scanner.next();
//        } while (doAgain.equals("y"));

        Scanner scanner = new Scanner(System.in);
        String doAgain = "";
                do {
                    System.out.print("Please enter your numerical grade: ");
                    int grade = scanner.nextInt();

                    if (grade >= 88) {
                        System.out.println("You received an A");
                    } else if (grade >= 80) {
                        System.out.println("You received a B");
                    } else if (grade >= 67) {
                        System.out.println("You received a C");
                    } else if (grade >= 60) {
                        System.out.println("You received a D");
                    } else {
                        System.out.println("You received a F");
                    }
            scanner.nextLine();
            System.out.println("Would you like to continue? (y/n)");
            doAgain = scanner.next();
        } while (doAgain.equals("y"));

    }
}
