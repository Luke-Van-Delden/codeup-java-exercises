package util;

public class InputTest {
    public static void main(String[] args) {
        Input stringer = new Input();

//        String tester = stringer.getString();

//        System.out.println(tester);

//        System.out.println(stringer.yesNo());

//        System.out.println(stringer.getInt(0,10) + " is between 1 and 10");
        System.out.println(stringer.getInt() + " is an Int");
        System.out.println(stringer.getDouble() + " is a Double");

//        System.out.println(stringer.getDouble(0,10) + " is a double between 1 and 10");

//        System.out.println(stringer.getDouble() + "is your double");
    }
}
