import java.util.Scanner;


public class Person {
    private String name;
//    public  Scanner scanner = new Scanner(System.in);


    public Person(String name){
        this.name = name;
    }

    public String getName() {
//TODO: return the person's name
        return name;
    }

    public void setName(String name) {
//TODO: change the name field to the passed value
        this.name = name;
    }

    public void sayHello() {
//TODO: print a message to the console using the person's name
        System.out.println("Hello " + name);
    }


    public static void main(String[] args) {
//        Person luke = new Person("Luke");
//        System.out.println(luke.name);
//        System.out.println(luke.getName());
//        luke.setName("Karl");
//        System.out.println(luke.name);
//        luke.sayHello();

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
    }
}
