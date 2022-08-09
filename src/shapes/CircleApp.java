package shapes;
import util.Input;

import java.util.Scanner;

public class CircleApp {

    public static void main(String[] args) {
        Input input = new Input();
        double radius = input.getDouble();
        Circle circle = new Circle(radius);

        System.out.printf("Area of circle utilizing %s as radius: %s", radius, circle.getArea());
        System.out.printf("%nCircumference of circle utilizing %s as radius: %s", radius, circle.getCircumference());
    }
}