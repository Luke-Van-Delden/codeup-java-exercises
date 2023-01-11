package shapes;

public class Rectangle extends Quadrilateral implements Measurable{
    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    public double getPerimeter() {
        return (2 * this.length) + (2 * this.width);
    }

    public double getArea() {
        return this.length * this.width;
    }

//    public void setWidth(double width) {
//        this.width = width;
//    }
//
//    public void setLength(double length) {
//        this.length = length;
//    }


    //    protected double width;
//    protected double length;
//
//    public Rectangle(double length, double width){
//        this.length = length;
//        this.width = width;
//    }
//
//    public double getPerimeter(){
//        return (2 * this.length) + (2 * this.width);
//    }
//
//    public double getArea(){
//        return this.length * this.width;
//    }
//
}