package shapes;
////no main here only methods !!!


//public class Rectangle {
//    protected int length;
//    protected int width;
//
//    //constructor here:
//    public Rectangle(int length, int width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    public int getLength() {
//        return length;
//    }
//
//    public int getWidth() {
//        return width;
//    }
//
//    public void setLength(int length) {
//        this.length = length;
//    }
//
//    public void setWidth(int width) {
//        this.width = width;
//    }
//
//    public int getArea(){
//        int area = length * width;
//        return area;
//    }
//
//    public int getPerimeter(){
//        int perimeter = 2 * length + 2 * width;
//        return perimeter;
//    }
//}

//------------Above here works for inheritance and polymorphism exercise------------//


public class Rectangle extends Quadrilateral implements Measurable{

    public Rectangle(int length, int width) {
        super(length, width);
    }

    @Override
    public void setLength(int length) {
        this.length=length;
    }

    @Override
    public void setWidth(int width) {
        this.width=width;
    }


    @Override
    public double getPerimeter() {
        double perimeter = 2 * length + 2 * width;
        System.out.print("The Rectangle's Perimeter is: ");
        return perimeter;
    }

    @Override
    public double getArea() {
        double area = length * width;
        System.out.print("The Rectangle's Area is: ");
        return area;
    }
}