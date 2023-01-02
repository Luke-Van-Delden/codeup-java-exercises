public class HelloWorld {
    public static void main(String[] args) {
        System.out.print("Hello, ");
        System.out.println("World!");
        int myFavoriteNumber = 7;
        System.out.println(myFavoriteNumber);
        String myString = "viscous";
        System.out.println(myString);
        myString = "c";
        System.out.println(myString);
        myString = "3.14159";
        System.out.println(myString);
        double myNumber = 3.14;
        System.out.println(myNumber);
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;

//        int three = (int) "three";

//        int x = 4;
//        x = x + 5;
//        System.out.println(x);
//        x = 4;
//        x += 5;
//        System.out.println(x);

//        int x = 3;
//        int y = 4;
//        y = y * x;
//        System.out.println(y);
//        y = 4;
//        y *= x;
//        System.out.println(y);

        int x = 10;
        int y = 2;
        x = x / y;
        y = y - x;
        System.out.println("x= " + x);
        System.out.println("y= " + y);

        x = 10;
        y = 2;
        x /= y;
        y -= x;
        System.out.println(x);
        System.out.println(y);

        short tooBig = 32767;
        System.out.println(tooBig);
        tooBig += 1;
        System.out.println(tooBig);
//        Loops through lowest value, like a circle
    }
}
