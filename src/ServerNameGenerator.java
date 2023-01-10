import java.lang.Math;

public class ServerNameGenerator {


    public static void createName(String [] adjectives, String [] nouns) {
        System.out.println("Here is your server name: ");
        System.out.println(adjectives[(int) Math.round(Math.random() * 9)] + "-" + nouns[(int) Math.round(Math.random() * 9)]);
    }
    public static void main(String[] args) {
        String [] adjectives = {"Handsome", "Happy", "Friendly", "Beautiful", "Kind", "Silly", "Funny", "Admirable", "Stoic", "Joyful"};
        String [] nouns = {"cat", "dog", "fish", "bird", "elephant", "monkey", "sparrow", "pokemon", "digimon", "flower"};
       createName(adjectives, nouns);
    }

}
