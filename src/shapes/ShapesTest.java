package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(5,4);
        System.out.println("The perimeter is : " + box1.getPerimeter());
        System.out.println("The area is : " + box1.getArea());
        Rectangle box2 = new Square(5);
        System.out.println("The perimeter is : " + box2.getPerimeter());
        System.out.println("The area is : " + box2.getArea());

    }
}
