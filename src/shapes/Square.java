package shapes;
//
//public class Square extends Rectangle {
//
//    protected int side;
//
//    @Override
//    public int getArea() {
//        return (int) Math.pow(side,2);
//    }
//
//    @Override
//    public int getPerimeter() {
//        return 4 * side;
//    }
//
//    //this is saying, the square is a rectangle with the same values for length and width
//    public Square(int side) {
//        super(side, side);
//        this.side = side;
//    }
//}

//------------Above here works for inheritance and polymorphism exercise------------//

public class Square extends Quadrilateral{
    protected int side;

//    @Override
//    public double getArea() {return (int) Math.pow(side,2);
//    }

    @Override
    public double getPerimeter() {
        int perimeter = 4 * length;
        System.out.print("The Square's perimeter is: ");
        return perimeter;
    }

    @Override
    public double getArea() {
        int area = (int) Math.pow(length,2);
        System.out.print("The Square's area is: ");
        return area;
    }

    //this is saying, the square is a rectangle with the same values for length and width
    public Square(int side) {
        super(side, side);
        this.length = side;
        this.width = side;
    }

    public Square(int length, int width) {
        super(length, width);
    }

    @Override
    public void setLength(int side) {
        this.length=this.width=side;
    }

    @Override
    public void setWidth(int side) {
        this.width=side;
    }

//    public int getSide() {
//        return side;
//    }
//
//    public void setSide(int side) {
//        this.side = side;
//    }
}
