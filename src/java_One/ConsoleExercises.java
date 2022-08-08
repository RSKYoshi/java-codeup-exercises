package java_One;

import java.text.DecimalFormat;
import java.util.Scanner;
import static java.lang.Integer.parseInt;


public class ConsoleExercises {
    public static void main(String[] args) {
        //below prints to the console. Uses %s to specify a value 'name'
//        String name = "codeup";
//        System.out.printf("Hello there, %s. Nice to see you.%n", name);

        //below will capture user input and return in console
        //first scanner specifies var type...next scanner is where we assign the var type to new scanner object
        //system.in is the source of the scanner
        //nextLine will capture both tokens in one string
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter something: ");
//        String userInput = scanner.nextLine();
//        System.out.println("You entered: --> \"" + userInput + "\" <--");

        //exercises below
//        below is a function like way to apply decimal places. Use df.format to apply to integers
//        DecimalFormat df = new DecimalFormat ();
//        df.setMaximumFractionDigits (2);
//        df.setMinimumFractionDigits (2);

        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %s. %n", df.format(pi));
        System.out.printf("The value of pi is approximately %.2f %n", pi);
                    //new exercise

        Scanner scanner = new Scanner(System.in);
        //what does this delimiter do???????????
//        scanner.useDelimiter("\n");
        System.out.print("Please enter an integer: ");
        int userInput = scanner.nextInt();
        System.out.println("You entered: --> \"" + userInput + "\" <--");
        scanner.nextLine();
                    //new exercise
        System.out.println("Please enter 3 words");
        String userInput1 = scanner.nextLine();
        scanner.nextLine();
        String userInput2 = scanner.nextLine();
        scanner.nextLine();
        String userInput3 = scanner.nextLine();
        System.out.printf("Word 1: %s%n Word 2: %s%n Word 3: %s%n", userInput1, userInput2, userInput3);
                //new exercise
        scanner.nextLine();
        System.out.println("Please enter a sentence");
        String sentence = scanner.nextLine();
        System.out.printf("Your sentence is: '%s'", sentence);

                //new exercise
        scanner.nextLine();

        scanner.useDelimiter("\n");

        System.out.println("Please enter length of classroom");
                //below is for working parse method
        String length = scanner.nextLine();
        double L = Double.parseDouble(length);
                //below is the working, non-parse method
//        int length = scanner.nextInt();

        System.out.println("Please enter width of classroom");
                 //below is for working parse method

        String width = scanner.nextLine();
        double W = Double.parseDouble(width);
                //below is the working, non-parse method
//        int width = scanner.nextInt();

                        //PERIMETER
            //below is the working Parse method
//        int Perimeter = ((Integer.parseInt(String.valueOf(length))) * 2) + (Integer.parseInt(String.valueOf(width)) * 2);
        double Perimeter = (L*2 + W*2);

        System.out.println("The perimeter is: " + Perimeter);

        //below is the working ParseInt method
//        int Perimeter = (length * 2) + (width * 2);
//        System.out.printf("The perimeter is: %s", Perimeter);

        // below is basically a br tag, use here for non-parse method
//        System.out.printf("%n");

                        //AREA//

        //below is the non-working parseInt method
//        int Area = parseInt(String.valueOf(length)) * parseInt(String.valueOf(width));
        double Area = (L*W);

        System.out.println("The area is: " + Area);

        //working non-parseInt method
//        int Area = length * width;
//        System.out.printf("The area is: %s", Area);
                    //VOLUME

        System.out.printf("%n");
        System.out.printf("%n");

        System.out.println("Please enter room height");
        String height = scanner.nextLine();
        double H = Double.parseDouble(height);
        double Volume = (L * W * H);
        System.out.printf("The volume of the room is: %s", Volume);
    }
}
