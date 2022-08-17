package util;
import java.util.Scanner;

//import static jdk.internal.org.jline.utils.Colors.s;


//Create a package inside of src named util. Inside of util, create a class named Input that has a private field named scanner. When an instance of this object is created, the scanner field should be set to a new instance of the Scanner class. The class should have the following methods, all of which return command line input from the user:
//
//        String getString()
//        boolean yesNo()
//        int getInt(int min, int max)
//        int getInt()
//        double getDouble(double min, double max)
//        double getDouble()
//        The yesNo method should return true if the user enters y, yes, or variants thereof, and false otherwise.
//
//        The getInt(int min, int max) method should keep prompting the user for input until they give an integer within the min and max. The getDouble method should do the same thing, but with decimal numbers.
//


public class Input {
    private Scanner sc = new Scanner(System.in);

    public String getString() {
//        Scanner sc = new Scanner(System.in);
//        System.out.printf("%nInput here: ");
        //this clears scanner
//        sc.nextLine();
        //listen for user input
        //        System.out.printf("Your input: %s" ,input);
        return sc.next();
    }

    //-------yesNo-------//
    public boolean yesNo() {
        System.out.printf("%n[y/N]: ");
        String input = sc.next();

        return input.equalsIgnoreCase("y") || input.equalsIgnoreCase("ye") || input.equalsIgnoreCase("yes");
    }
    //-------getIntRange-------//
//    public int getIntRange(){
//        //        sc.nextLine();
//        System.out.printf("%nEnter int: ");
//        boolean intRange;
//        int result;
//        do{
//            int userInt = sc.nextInt();
//            result = userInt;
//            if(userInt>10||userInt==0){
//                System.out.printf("%nEnter int within 1-10 range: ");
//            } else {
//                System.out.printf("%nYour int is: ");
//            }
////            String userInt2 = sc.next();
//            //below: intRange = 1-10
//            //if intRange is outside 1-10, keep prompting for input
//            //if input is correct, output that and move on
//            intRange = (userInt>10||userInt==0);
//        }while(intRange);
//        return result;
//    }


    public int getIntRange(int min, int max, String prompt) {
        System.out.println(prompt);
//        System.out.printf("%nEnter int: ");
//        System.out.println("Enter Int: ");
        int userInt = sc.nextInt();
        if (userInt < min || userInt > max) {
//            System.out.println("Enter an integer within 1-1000");
            System.out.printf("%s is not a valid selection: Enter number within range: "+"%n", userInt);
            return getIntRange(min,max, prompt);

        }
        return userInt;
//        System.out.print("Your int is: ");
    }


    //-------getInt-------//
    public int getInt() {
//        return sc.nextInt();
        //uncomment above line for method to work without using below: try-catch
        while(true){

        try {
            return Integer.valueOf(getString());
        } catch (NumberFormatException e) {
            System.out.println("Input was either a string, double, or number entered exceeded 32 bits of memory(2,147,483,647): Expected an integer within range.");
            System.out.println(e);
            System.out.println("Enter Int: ");
        }
        return getInt();
    }
    }

    //-------getDoubleRange-------//
    public double getDoubleRange(double min, double max) {
        try{
            System.out.printf("%nEnter double: ");
            double userDoubleR = sc.nextDouble();
            if (userDoubleR > max || userDoubleR < min) {
                System.out.printf("%nEnter double within range: ");
            }
            return userDoubleR;
        } catch (NumberFormatException e) {
            System.out.println("Input was a string; Expected a double");
            System.out.println(e);
        }
        return getDoubleRange(min, max);
    }
        //-------getDouble-------//
        //change radius back to 'double' once bonus is achieved
    public double getDouble () {
//        return sc.nextDouble();
        //uncomment above line for method to work without using below try catch
        try {
            return Double.valueOf(getString());
        } catch (NumberFormatException e) {
            System.out.println("Input was a string; Expected a double");
            System.out.println(e);
        }
        return getDouble();
        ///use try catch here to catch string's & non-double's
    }}



