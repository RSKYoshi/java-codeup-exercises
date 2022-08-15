package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {
    protected int length;
    protected int width;
    //constructor
    public Quadrilateral(int length, int width) {
        this.length = length;
        this.width = width;
    }


    //getter for length
    public int getLength() {
        return length;
    }
    //setter for length
//    public void setLength(int length) {
//        this.length = length;
//    }
    //getter for width
    public int getWidth() {
        return width;
    }
    //setter for width
//    public void setWidth(int width) {
//        this.width = width;
//    }

    public abstract void setLength(int length);
    public abstract void setWidth(int width);

}





