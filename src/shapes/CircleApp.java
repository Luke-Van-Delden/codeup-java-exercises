package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        System.out.println("What is the radius of the circle?");
        Input stringer = new Input();
        Circle tester = new Circle(stringer.getDouble());
        System.out.println(tester.getArea());
        System.out.println(tester.getCircumference());
    }
    }
