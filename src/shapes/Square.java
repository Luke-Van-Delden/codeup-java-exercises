package shapes;

public class Square extends Rectangle {
    public double side;
    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    public double getPerimeter(){
        return 4 * side;
    }

    public double getArea(){
        return Math.pow(side, 2);
    }
}
