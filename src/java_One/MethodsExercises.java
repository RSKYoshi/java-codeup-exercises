package java_One;
import java.util.Scanner;
import java.lang.Math;

public class MethodsExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Addition:%n");
        String addX = sc.next();
        double addDX = Double.parseDouble(addX);
        String addY = sc.next();
        double addDY = Double.parseDouble(addY);
        addition(addDX, addDY);

        sc.nextLine();
        System.out.printf("%n%nSubtraction: Enter number to subtract from first, then enter next number to subtract from first number:%n");
        String subX = sc.next();
        double subDX = Double.parseDouble(subX);
        String subY = sc.next();
        double subDY = Double.parseDouble(subY);
        subtraction(subDX, subDY);

        sc.nextLine();
        System.out.printf("%n%nMultiplication:%n");
        String mulX = sc.next();
        double mulDX = Double.parseDouble(mulX);
        String mulY = sc.next();
        double mulDY = Double.parseDouble(mulY);
        System.out.println("The product is: " + multiplication(mulDX, mulDY));
//        uncomment below for non-recursive method
//            multiplication(mulDX, mulDY);

        sc.nextLine();
        System.out.printf("%n%nDivision:%n");
//        double divIntx = Double.parseDouble(sc.next());
//        double divInty = Double.parseDouble(sc.next());
        String divX = sc.next();
        double divDX = Double.parseDouble(divX);
        String divY = sc.next();
        double divDY = Double.parseDouble(divY);
        division(divDX, divDY);

        sc.nextLine();
        System.out.printf("%n%nModulus:%n");
        String modX = sc.next();
        double modDX = Double.parseDouble(modX);
        String modY = sc.next();
        double modDY = Double.parseDouble(modY);
        modulus(modDX, modDY);

        sc.nextLine();
        getInteger(1, 100);

        sc.nextLine();
        System.out.printf("%n%nPlease enter integer:%n");
        long userInputFactorial = Long.parseLong(sc.next());
        System.out.println(getFactorial(userInputFactorial));

        sc.nextLine();
        System.out.printf("%n%nPlease enter side for dice:%n");
        int userSides = Integer.parseInt(sc.next());
        int userDiceSides = Integer.parseInt(String.valueOf(userSides));
        System.out.printf("%nRoll the dice? [y/n]%n");
        rollDice(userDiceSides);
    }

    // addition
    public static void addition(double x, double y) {
        double total = x + y;
        System.out.printf("The sum is: %s", total);
    }

    // subtract
    public static void subtraction(double x, double y) {
        double total = x - y;
        System.out.printf("The difference is: %s", total);
    }

    // multiply
//    public static void multiplication(double x, double y) {
//        double total = x * y;
    //loop-method here:
//        double total = 0;
//        for(double i=0;i<y;i++){
//            total+=x;
//        }
//        System.out.printf("The product is: %s", total);
//    }
    //---------------------------
    //multiply recursive method here:
    public static double multiplication(double x, double y) {
        if (x == 0 || y == 0) {
            return 0;
        } else
            return (x + multiplication(x, y - 1));
    }

    //-------------------
    // divide
    public static void division(double x, double y) {
        if (x == 0 || y == 0) {
            System.out.println("0 may not be used in division");
        } else {
            double total = x / y;
            System.out.printf("The quotient is: %s", total);
        }
    }

    // modulus
    public static void modulus(double x, double y) {
        double total = x % y;
        System.out.printf("The equivalence is: %s", total);
    }

    //get integer
    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("%n%nPlease enter integer:%n");
        int userInput = Integer.parseInt(sc.next());
//        userInt = sc.next();
        if (userInput > max || userInput < min) {
            System.out.println("Please enter an integer within range: ");
//            Scanner sc = new Scanner(System.in);
//            int userInput = Integer.parseInt(sc.next());
            return getInteger(min, max);
        } else System.out.printf("Integer, ranged 1-100: %s", userInput);
        return userInput;
    }


//    Prompt the user to enter an integer from 1 to 10.
//    Display the factorial of the number entered by the user.
//    Ask if the user wants to continue.
//    Use a for loop to calculate the factorial.


//    Assume that the user will enter an integer, but verify it’s between 1 and 10.
//    Use the long type to store the factorial.
//    Continue finding factorials from user input, only if the user agrees to.


    public static long getFactorial(long x) {
        System.out.printf("Your number is %s%n", x);
        System.out.println("Show factorial using your integer? [y/n]");
        Scanner sc = new Scanner(System.in);
        String continue1 = sc.next();
        //if user types yes, continue....else move on to next method
        if(continue1.equals("y")||continue1.equals("yes")){
            //evaluate if user int is within range. If it is, continue to print out factorial once before asking to continue again. If input is not within range, keep prompting to enter an integer within range until it is within range.
            if (x > 10 || x == 0) {
                System.out.println("Please enter an integer within range: ");
                sc = new Scanner(System.in);
                long newUserInt = sc.nextLong();
                getFactorial(newUserInt);
            }
            //output factorial of x, which is the user input, here:
            //this works to output the factorial
            long userInp = x;
            long factorial = 1;
            for (long i = 1; i <= userInp; i++) {
                factorial *= i;
            }
            //print out factorial line thing
            int factorialVisual = 1;
            //add sout here to add things before fluffy line
            System.out.printf("%s!: ",x);
            for (long i = 1;i<=userInp;i++) {
//                factorialVisual += factorialVisual * userInp;
//                return x*getFactorial(x-1);
                if(i==x){
                    System.out.print(factorialVisual + "=");
                }else {
                    System.out.print(factorialVisual + "x");
                } factorialVisual+=1;
            } System.out.println(factorial);

            //Print out factorial here
//            System.out.printf("%s!" + " " + "=" + " " + factorial, x, x);
            //TODO: after printing factorial, prompt user to continue. If yes, use recursion to call the getFactorial method and start over. If no, exit and move on.
            System.out.println("Continue entering factorial? [y/n]");
            sc = new Scanner(System.in);
            String continue2 = sc.next();
            if(continue2.equals("y")||continue2.equals("yes")){
                System.out.println("Please enter int: ");
                int newInput = Integer.parseInt(sc.next());
                getFactorial(newInput);
            }
        }
        //need to find a way so that the if/else can exit AND not output 0; as is, it works, but 0 is output.
        return 0;
    }

//TODO: Refactor getFactorial to use do while loop, to avoid using the return 0 at the end to break out of if/else;
        //Exercise #4 Dice Roll

        public static void rollDice ( int sides){
            Scanner sc = new Scanner(System.in);
            String userY2 = sc.next();
            int dice1 = (int) (Math.random() * (sides) + 1);
            System.out.printf("Dice 1: %s", dice1);
            int dice2 = (int) (Math.random() * (sides) + 1);
            System.out.printf("%nDice 2: %s", dice2);
            System.out.printf("%nRoll dice again? [y/n]%n");
            boolean keepRolling = true;
            while (keepRolling) {
                String userDecision = sc.next();
                boolean userY = userDecision.equals("y");
                if (userY) {
                    int diceO = (int) (Math.random() * (sides) + 1);
                    System.out.printf("Dice 1: %s", diceO);
                    int diceT = (int) (Math.random() * (sides) + 1);
                    System.out.printf("%nDice 2: %s", diceT);
                    System.out.printf("%nRoll dice again? [y/n]%n");
                    keepRolling = userY2.equals("y");
                } else break;
            }
            System.out.println("goodbye");
        }

        //Exercise #5 Game Development 101

//    You are going to build a high-low guessing game. Create a class named HighLow inside of src.
//
//    The specs for the game are:
//
//    Game picks a random number between 1 and 100.
//    Prompts user to guess the number.
//    All user inputs are validated.
//    If user's guess is less than the number, it outputs "HIGHER".
//    If user's guess is more than the number, it outputs "LOWER".
//    If a user guesses the number, the game should declare "GOOD GUESS!"
//    Hints
//
//    Use the random method of the java.lang.Math class to generate a random number.



    }




