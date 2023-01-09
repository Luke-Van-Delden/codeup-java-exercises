import org.w3c.dom.ls.LSOutput;
import util.Input;

import java.util.Arrays;

public class ArraysExercises {
    public static void addPerson(Person [] array, Person newPerson) {
        Person [] newArray = new Person[(array.length + 1)];
//        Arrays.fill(newArray, new Person("Placeholder"));
        for(int i = 0; i < array.length; i++){
            newArray[i] = array[i];
        }
            newArray[array.length] = newPerson;
        for(Person newArrays : newArray) {
            System.out.println(newArrays.getName());
        }
//        System.out.println(Arrays.toString(newArray));
    }

    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);
//        System.out.println(Arrays.toString(numbers));

        Person [] people = {new Person("Moe"), new Person("Larry"), new Person("Curley")};
        for(Person peoples : people) {
            System.out.println(peoples.getName());
        }
        Input addedName = new Input();
//        addedName.getString();
//        System.out.println(addedName);
        Person tester = new Person(addedName.getString());
        addPerson(people,tester);
    }
}
