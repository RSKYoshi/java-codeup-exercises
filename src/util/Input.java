package util;
import java.util.Scanner;



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
        String input = sc.next();
//        System.out.printf("Your input: %s" ,input);
        return input;
    }
    //-------yesNo-------//
    public boolean yesNo() {
        System.out.printf("%n[y/N]: ");
        String input = sc.next();

        return input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes");
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


    public int getIntRange(){
        System.out.printf("%nEnter int: ");
        int userInt = sc.nextInt();
        if(userInt>10||userInt==0){
            System.out.printf("%nEnter int within 1-10 range: ");
            getIntRange();
        } else {
            System.out.printf("%nYour int is: ");
        }
        return userInt;
    }



    //-------getInt-------//
    public int getInt(){
//        System.out.println("Enter Int: ");
        int userInt= sc.nextInt();
//        System.out.print("Your int is: ");
        return userInt;
    }
    //-------getDoubleRange-------//
    public double getDoubleRange(){
        System.out.printf("%nEnter double: ");
        boolean doubleRange;
        double resultR;
        do{
            double userDoubleR = sc.nextDouble();
            resultR = userDoubleR;
            if(userDoubleR>10||userDoubleR==0){
                System.out.printf("%nEnter double within 1-10 range: ");
            } else {
                System.out.printf("%nYour double is: ");
            }
            //below: intRange = 1-10
            //if intRange is outside 1-10, keep prompting for input
            //if input is correct, output that and move on
            doubleRange = (userDoubleR>10||userDoubleR==0);
        }while(doubleRange);
        return resultR;
    }
    //-------getDouble-------//
    //change radius back to 'double' once bonus is achieved
    public double getDouble(){
        System.out.println("Enter Radius: ");
        double userDouble = sc.nextDouble();
//        System.out.print("Your Radius is: ");
        return userDouble;
    }


//    public int getInt() {
//        Scanner sc = new Scanner(System.in);
//        int userIntSelected = sc.nextInt();
//        if(userIntSelected>5||userIntSelected<0){
//            System.out.println("Please enter a selection 1-5");
//        }
//        return userIntSelected;
//    }
}

//}
