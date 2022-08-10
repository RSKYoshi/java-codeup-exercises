package shapes;

//Inside of src, create a package named shapes. Inside of shapes, create a class named Circle. This class should have a private radius field
//that is set through the constructor, and various methods for getting information about the circle, detailed below.


//this app only contains code to make a circle; that is it. No more, no less.
public class Circle {
    private Double radius;
    double pi = Math.PI;

    public Circle(Double radius) {
        this.radius=radius;
    }

    public Double getArea(){
       double area = pi * (Math.pow(radius, 2));
       return area;
    }

    public Double getCircumference(){
        double circumference = 2 * pi * radius;
        return circumference;
    }
}
