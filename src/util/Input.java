package util;
import java.util.Scanner;


public class Input {
    private final Scanner scanner;

    public Input(){
        this.scanner = new Scanner(System.in);
    }
    String getString(){
        return this.scanner.nextLine();
    }


    boolean yesNo(){
        if (this.scanner.nextLine().equals("y")){
            return true;
        }
        else {
            return false;
        }
    }

    int getInt(int min, int max){
        int userInput = this.scanner.nextInt();
        if (userInput > min && userInput < max){
            return userInput;
        }
        else {
           return getInt(0, 10);
        }
    }

     int getInt(){
        return this.scanner.nextInt();
    }

    double getDouble(double min, double max){
        double userInput = this.scanner.nextDouble();
        if (userInput > min && userInput < max){
            return userInput;
        }
        else {
            return getDouble(0, 10);
        }
    }
    double getDouble(){
        return this.scanner.nextDouble();
    }
    public static void main(String[] args) {
        System.out.println("type something");
    Input stringer = new Input();

//        String tester = stringer.getString();
//        System.out.println(tester);

//        System.out.println(stringer.yesNo());

//        System.out.println(stringer.getInt(0,10) + " is between 1 and 10");

//        System.out.println("Your int is " + stringer.getInt());

        System.out.println(stringer.getDouble(0,10) + " is a double between 1 and 10");

        System.out.println(stringer.getDouble() + "is your double");
    }
    }
