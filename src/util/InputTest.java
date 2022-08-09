package util;
import java.util.Scanner;

//        Create another class named InputTest that has a static main method that uses all the methods from the Input class.

public class InputTest {
    public static void main(String[] args) {
        //this pulls in all methods from Input.java
        Input userInput = new Input();
        //method: getString
        System.out.println(userInput.getString());
        //        method: boolean yesNo()
        System.out.println(userInput.yesNo());
        //method: int getInt(int min, int max)
        System.out.println(userInput.getIntRange());
        //        int getInt()
        System.out.println(userInput.getInt());
        //        double getDouble(double min, double max)
        System.out.println(userInput.getDoubleRange());
        //        double getDouble()
        System.out.println(userInput.getDouble());

    }
}
