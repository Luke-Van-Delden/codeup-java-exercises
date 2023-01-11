package shapes;

public class ShapesTest {
    public static void main(String[] args) {
//        Rectangle rect = new Rectangle(5,10);
//        System.out.println("rect.getPerimeter() = " + rect.getPerimeter());
//        System.out.println("rect.getArea() = " + rect.getArea());
//        Square squ = new Square(5,5);
//        System.out.println("squ.getPerimeter() = " + squ.getPerimeter());
//        System.out.println("squ.getArea() = " + squ.getArea());
        Measurable myShape = new Rectangle(3,10);
        System.out.println("myShape.getPerimeter() = " + myShape.getPerimeter());
        System.out.println("myShape.getArea() = " + myShape.getArea());

        myShape = new Square(5,5);
        System.out.println("myShape.getArea() = " + myShape.getArea());
    }
}
