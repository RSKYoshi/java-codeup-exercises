package java_One;

import java.util.Scanner;

import static java.lang.Math.pow;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        sc.useDelimiter("\n");
        System.out.print("Check for infinite loops before continuing [y/N] ");
        String userInput = sc.next();
        boolean confirmation = userInput.equals("y");

        if (confirmation) {
            //EXERCISE #1
            //#1a
//            int i = 5;
//            while (i<=15){
//                System.out.println("i is " + i);
//                i++;
            //#1b
//            int i = 0;
//            do {
//                i += 2;
//                System.out.printf("%s%n", i);
//            } while (i<100);
//            ----------
//            int i = 100;
//            do {
//                i -= 5;
//                System.out.printf("%s%n", i);
//            } while (i> -10);
//            ------------
//            long i = 2;
//            do {
//                System.out.printf("%s%n", i);
//                i*=i;
//            } while (i<1000000);
            //#1c
            //refactoring #1a:
            System.out.printf("%n");
            for (int i = 5; i <= 15; i++) {
                System.out.println("i is " + i);
            }
            //refactoring 31b:
            for (long i = 2; i < 1000000; i *= i) {
                System.out.printf("%s%n", i);
            }
            //EXERCISE #2 FIZZBUZZ
            for (int i = 1; i <= 100; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else
                    System.out.println(i);
            }
            //Exercise #3 Display a table of powers
            boolean confirmation3;
            do {
                System.out.println("What number would you like to go up to?");
                Scanner scanner = new Scanner(System.in);
                int userNum = scanner.nextInt();
//            int numS = userNum * userNum;
//            int numC = (int) Math.pow(userNum, 3);
                System.out.print("Here is your table: ");
                System.out.printf("%n%n    |  number | squared | cubed |");
                System.out.printf("%n    | - - - - | - - - - | - - - |");

                //need to format the number lines when the integers get larger to fit. Use break statements or if else
                for (int i = 1; i <= userNum; i++) {
                    int iSquared = i * i;
                    int iCubed = (int) Math.pow(i, 3);
                    System.out.printf("%n    |  %s      | %s       | %s     |", i, iSquared, iCubed);
                }
                System.out.printf("%n Would you like to continue?");
                //do-while below
                String userInput3 = sc.next();
                confirmation3 = userInput3.equals("y");
            } while (confirmation3);
            //end of do-while

            //below doesn't loop, only executes once before moving on, if true
//            if(confirmation3){
//                for(int i=userNum;i<=1000;i++){
//                    int iSquared = i*i;
//                    int iCubed = (int) Math.pow(i, 3);
//                    if(iSquared == 10-99 && iCubed == 10-99){
//                        System.out.printf("%n    |  %s      | %s     | %s    |", i, iSquared, iCubed);
//                    } else System.out.printf("%n    |  %s      | %s       | %s     |", i, iSquared, iCubed);
//                }
//            }


            //Exercise #4 Convert given number grades into letter grades
            boolean confirmation4;
            do {
                Scanner scanner = new Scanner(System.in);
                System.out.printf("%n%nPlease enter your exam grade in points(integer)%n");
                int userEntry = scanner.nextInt();
                switch (userEntry) {
                    case 95, 96, 97, 98, 99, 100:
                        System.out.printf("%nYour grade is: A+ -- Professional");
                        break;
                    case 88, 89, 90, 91, 92, 93, 94:
                        System.out.printf("%nYour grade is: A -- Ok, I see you");
                        break;
                    case 85, 86, 87:
                        System.out.printf("%nYour grade is: B+ : Almost there");
                        break;
                    case 80, 81, 82, 83, 84:
                        System.out.printf("%nYour grade is: B -- Not bad");
                        break;
                    case 75, 76, 77, 78, 79:
                        System.out.printf("%nYour grade is: C+ -- Just a bit more studying...");
                        break;
                    case 67, 68, 69, 70, 71, 72, 73, 74:
                        System.out.printf("%nYour grade is: C -- I can tell you like to live on the edge ");
                        break;
                    case 64, 65, 66:
                        System.out.printf("%nYour grade is: D+ -- retest!");
                        break;
                    case 60, 61, 62, 63:
                        System.out.printf("%nYour grade is: D: at least it's not an F");
                    default:
                        System.out.printf("%nSee you in class next semester");
                }
                System.out.printf("%n Would you like to continue?");
                //do-while below
                String userInput4 = sc.next();
                confirmation4 = userInput4.equals("y");
            }while(confirmation4);


        } else System.out.println("Goodbye");
    }
}

