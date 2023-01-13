package util;
import java.util.Scanner;


public class Input {
    private final Scanner scanner;

    public Input(){
        this.scanner = new Scanner(System.in);
    }
    public String getString(){
        System.out.print("Provide Input >");
        return this.scanner.nextLine();
    }

//    public static String notAnIntError() throws Exception{
//
//    }

    public boolean yesNo(){
        if (this.scanner.nextLine().equals("y")){
            return true;
        }
        else {
            return false;
        }
    }

    public int getInt(int min, int max){
        int userInput = this.scanner.nextInt();
        if (userInput > min && userInput < max){
            return userInput;
        }
        else {
           return getInt(0, 10);
        }
    }

     public int getInt(){
        System.out.print("(Int)");
         try {
             return Integer.valueOf(getString());
         }
         catch (Exception e){
             e.printStackTrace();
             System.out.println("Testing dont do good");
             return getInt();
         }
    }

    public double getDouble(double min, double max){
        double userInput = this.scanner.nextDouble();
        if (userInput > min && userInput < max){
            return userInput;
        }
        else {
            return getDouble(0, 10);
        }
    }
    public double getDouble(){
        System.out.print("(Double)");

        try {
           return Double.valueOf(getString());
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("Testing dont do good");
            return getDouble();
        }
//        return this.scanner.nextDouble();
    }
    public static void main(String[] args) {
        System.out.println("type something");
    Input stringer = new Input();

        int tester = stringer.getInt();
        System.out.println(tester);

//        System.out.println(stringer.yesNo());

//        System.out.println(stringer.getInt(0,10) + " is between 1 and 10");

//        System.out.println("Your int is " + stringer.getInt());

//        System.out.println(stringer.getDouble(0,10) + " is a double between 1 and 10");
//
//        System.out.println(stringer.getDouble() + "is your double");
    }
    }
