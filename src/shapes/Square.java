package shapes;

public class Square extends Quadrilateral {
        protected double side;

    public Square(double length, double width){
        super(length,width);
        side = this.length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getPerimeter() {
        return 4 * side;
    }

    public double getArea() {
        return side * side;
    }


//    public double side;
//    public Square(double side) {
//        super(side, side);
//        this.side = side;
//    }
//
//    public double getPerimeter(){
//        return 4 * side;
//    }
//
//    public double getArea(){
//        return Math.pow(side, 2);
//    }
}
