package util;
import java.util.Scanner;

//        Create another class named InputTest that has a static main method that uses all the methods from the Input class.

public class InputTest {
    public static void main(String[] args) {
        //this pulls in all methods from Input.java
        Input userInput = new Input();
        System.out.println("Enter string: ");
        //method: getString
        System.out.println(userInput.getString());
        //        method: boolean yesNo()
        System.out.println("True or false? ");
        System.out.println(userInput.yesNo());
        //        int getInt()
//        System.out.println("Enter Int");
        System.out.println(userInput.getInt("Enter Int: "));
        //method: int getInt(int min, int max)
//        System.out.println("Enter num 1-10");
        System.out.println(userInput.getIntRange(1,10,"Enter num 1-10"));
        //        double getDouble()
        System.out.println("Enter double");
        System.out.println(userInput.getDouble());
        //        double getDouble(double min, double max)
        System.out.println("Enter double 1-10");
        System.out.println(userInput.getDoubleRange(1,10));
    }
}
