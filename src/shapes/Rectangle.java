package shapes;

public class Rectangle {
    public double width;
    public double length;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double getPerimeter(){
        return (2 * this.length) + (2 * this.width);
    }

    public double getArea(){
        return this.length * this.width;
    }

}
