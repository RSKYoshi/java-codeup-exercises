package shapes;

public class ShapesTest {
    public static void main(String[] args) {
//        create a variable of the type Rectangle named box1 and assign it a new instance of the Rectangle class with a width of 4 and a length of 5
//        verify that the getPerimeter and getArea methods return 18 and 20, respectively.
//                create a variable of the type Rectangle named box2 and assign it a new instance of the Square class that has a side value of 5.
//        verify that the getPerimeter and getArea methods return 20 and 25, respectively.


//        Rectangle box1 = new Rectangle(5,4);
//        System.out.println(box1.getPerimeter());
//        System.out.println(box1.getArea());
//
//        Rectangle box2 = new Square(5);
//        System.out.println(box2.getPerimeter());
//        System.out.println(box2.getArea());

        //-------Above works for Inheritance and Polymorphism exercises-------//



                Measurable mySquare=new Square(7);
                System.out.println(mySquare.getPerimeter());
                System.out.println(mySquare.getArea());
                Measurable myRectangle = new Rectangle(7,5);
                System.out.println(myRectangle .getPerimeter());
                System.out.println(myRectangle .getArea());




    }
}
