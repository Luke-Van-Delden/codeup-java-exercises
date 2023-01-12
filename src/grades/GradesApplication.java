package grades;
import java.util.*;
import java.util.Scanner;


public class GradesApplication {
    public static void main(String[] args) {
        ArrayList<Integer> lgrades = new ArrayList<>();
        lgrades.add(100);
        lgrades.add(100);
        lgrades.add(100);
        ArrayList<Integer> bgrades = new ArrayList<>();
        bgrades.add(100);
        bgrades.add(50);
        bgrades.add(25);
        bgrades.add(0);
        ArrayList<Integer> kgrades = new ArrayList<>();
        kgrades.add(100);
        kgrades.add(99);
        kgrades.add(98);
        kgrades.add(97);
        ArrayList<Integer> fgrades = new ArrayList<>();
        fgrades.add(100);
        fgrades.add(90);
        fgrades.add(80);
        fgrades.add(70);

        Student Luke = new Student("Luke", lgrades);
        Student Brian = new Student("Brian", bgrades);
        Student Kara = new Student("Kara", kgrades);
        Student Frankie = new Student("Frankie", fgrades);

        HashMap<String, Student> students = new HashMap<>();
        students.put("LukeTheDuke", Luke);
        students.put("BBlick", Brian);
        students.put("Wifey4Lifey", Kara);
        students.put("Frankster", Frankie);

//        System.out.println("Initializing Testrun");
//        for (HashMap.Entry<String, Student> entry : students.entrySet()) {
//            System.out.println("Github username: " +entry.getKey() + " | Name: " + entry.getValue().getName()+ " | Grade Average: " + entry.getValue().getGradeAverage());
//        }

        System.out.println("Welcome!");
        System.out.println();
        System.out.println("Here are the GitHub usernames of our students:");
        System.out.println();
//        for (HashMap.Entry<String, Student> entry : students.entrySet()) {
//            System.out.print(" | " + entry.getKey() + " | ");
//        }
        Scanner scanner = new Scanner(System.in);
        String userInput = "";
        boolean found = true;
        do {
            for (HashMap.Entry<String, Student> entry : students.entrySet()) {
                System.out.print(" | " + entry.getKey() + " | ");
            }
            System.out.println();
            System.out.println();

            System.out.println("What student would you like to see more information on?");
            System.out.print(">");
            userInput = scanner.nextLine();
            for (HashMap.Entry<String, Student> entry : students.entrySet()) {
                if (userInput.equals(entry.getKey())){
                    System.out.println(" | " + entry.getKey() + " found |");
                    System.out.println("Name: " + entry.getValue().getName() + " - Github Username: " + entry.getKey());
                    System.out.println("Current Average: " + entry.getValue().getGradeAverage());
                    found = true;
                    break;
                }
                else {
                    found = false;
                }
            }
            if (!found){
                System.out.println("Sorry, no student found with the GitHub username of " + userInput + ".");
            }
            System.out.println("Would you like to see another student? (y/n)");
            userInput = scanner.nextLine();
            userInput = userInput.toLowerCase();
        } while (userInput.contains("y"));

        System.out.println("Goodbye! Have a wonderful day!");

    }
}
