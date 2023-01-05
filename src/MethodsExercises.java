import java.util.Scanner;

public class MethodsExercises {
    public static Scanner scanner = new Scanner(System.in);
    static String doAgain = "";

    public static void multiply() {
        System.out.println("What numbers would you like to multiply? ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println(x + " times " + y + " equals " + x * y);
    }

    public static void subtract() {
        System.out.println("What numbers would you like to subtract? ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println(x + " minus " + y + " equals " + (x - y));
    }

    public static void addition() {
        System.out.println("What numbers would you like to add? ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println(x + " plus " + y + " equals " + (x + y));
    }

    public static void divide() {
        System.out.println("What numbers would you like to divide? ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println(x + " divided by " + y + " equals " + (x / y));
    }

    public static int betweenNumber(int min, int max) {
        System.out.println("Enter a valid integer between 1-10:");
        int userInput = scanner.nextInt();
        if (userInput < min || userInput > max) {
            return betweenNumber(min, max);
        }
        return userInput;
    }

    public static void factorial(int min, int max) {
        do {
            int userInput = betweenNumber(min, max);
            String factorialString = "";
            long finalFact = 1;
            for(int i = 1; i <= userInput; i++){
                if (i == 1){
                    factorialString = factorialString + i;
                    System.out.println(i + "! = " + factorialString + " = " + finalFact);

                }
                else if (i == userInput) {
                    factorialString = i + "! = " + factorialString + " x " + i + " = " + finalFact * i;
                    System.out.println(factorialString);
                }
                else {
                    finalFact = finalFact * i;
                    factorialString = factorialString + " x " + i;
                    System.out.println(i + "! = " + factorialString + " = " + finalFact);
                }
            }
            System.out.println("Do you want to do try a different number? y/n");
            doAgain = scanner.next();
        } while (doAgain.equals("y"));
    }


        public static void main(String[] args) {
//        addition();
//        subtract();
//        multiply();
//        divide();
//        System.out.println(betweenNumber(1,10));
//        factorial(1,10);

    }

}
