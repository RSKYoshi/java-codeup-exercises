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
        getFactorial(userInputFactorial);

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
        if(x > 10 || x == 0){
            System.out.println("Please enter an integer within range: ");
            Scanner sc = new Scanner(System.in);
            long newUserInt = sc.nextLong();
            getFactorial(newUserInt);
        }
        //output factorial of x, which is the user input, here:
        long userInp = x;
        long factorial = 1;
        for (long i = 1; i <= userInp; i++) {
//            System.out.println();
//            factorial += factorial * i;
            factorial *= i;
//            return x*getFactorial(x-1);
        }
        System.out.printf("%s!" +" "+ "=" + " " + factorial, x,x);




//        System.out.println(factorial);
//        return factorial;

//        System.out.printf("Do you want to continue? [y/n]%n");
//        String continueResponse = sc.next();
//        if(continueResponse.equals("y")){
//            getFactorial(x);
//            System.out.println("Please enter an integer within range: ");
////            Scanner sc = new Scanner(System.in);
//            sc.nextLine();
//            long userInputFactorial = sc.nextLong();
//            return getFactorial(userInputFactorial);
//        }


//        String userInputF = sc.next();
//        if (userInputF.equals("y")) {
////            getFactorial(userInputFactorial);
//        }
//        getInteger();
//        System.out.println("Enter");
//        Scanner sc = new Scanner(System.in);
//        String userYN = sc.nextLine();
//        boolean promptResponse;
//        promptResponse = userYN.equals("y");
//        if(promptResponse){
//        if (x > 10 || x == 0) {
//            System.out.println("Please enter an integer within range: ");
//            Scanner sc = new Scanner(System.in);
//            sc.nextLine();
//            long userInputFactorial = sc.nextLong();
//            return getFactorial(userInputFactorial);
//        }
//
//
//            long builtFactorial = 1;
//            for (int i = 1; i < x; i++) {
//                System.out.printf("%s!" + "is" + getFactorial(x), x);
//                builtFactorial += builtFactorial * i;
//                System.out.println(x*getFactorial(x-1));
//                here for sout continue
//                continue up to 1000
//                    System.out.printf("Do you want to continue to 1000? [y/n]%n");
//            }
//            return builtFactorial;
//            return getFactorial(x);
//            System.out.printf("%s! = %s",x,getFactorial(x));
//        }
//
//        System.out.println("Continue? [y/n]");
//        return;
//        System.out.println("Continue? [y/n]");
//        String userYN2 = sc.nextLine();
//        do {
//        promptResponse = userYN2.equals("y");
//            sc.nextLine();
//            Scanner sc = new Scanner(System.in);
//            if(promptResponse){
//                return getFactorial(x);
//            }
//            if (x > 10 || x == 0) {
//                System.out.println("Please enter an integer within range: ");
//                userInputFactorial = where user input is stored
//                long userInputFactorial = sc.nextLong();
//                return getFactorial(userInputFactorial);
                //put an x before each new var
//            } else {
//            System.out.printf("%s!" + "is" + getFactorial(x), x,x);
//                long builtFactorial = 1;
//                for (int i = 1; i < x; i++) {
//                System.out.printf("%s!" + "is" + getFactorial(x), x,x);
//                    builtFactorial += builtFactorial * i;
//                return x*getFactorial(x-1);
//                }
//                return builtFactorial;
                // "!x = x" +"is" +getFactorial(x);
//            }
//        } while (promptResponse);
        return x;
    }


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

    }




