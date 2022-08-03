import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Continue? [y/N] ");
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
            //refactoring a:
//            for (int i=5;i<=15;i++){
//                System.out.println("i is " + i);
//            }
            //refactoring b:
//            for(long i=2;i<1000000;i*=i){
//                System.out.printf("%s%n", i);
//            }
                   //EXERCISE #2 FIZZBUZZ
//            for(int i=1;i<=100;i++){
//                if(i%3 == 0 && i%5 == 0){
//                    System.out.println("FizzBuzz");
//                } else if(i%3==0){
//                    System.out.println("Fizz");
//                } else if(i%5==0){
//                    System.out.println("Buzz");
//                } else
//                    System.out.println(i);
//            }
                    //Exercise #3 Display a table of powers
            System.out.println("Please enter an integer");
            Scanner scanner = new Scanner(System.in);
            int tableInput = scanner.nextInt();
            System.out.printf("Here is your number: %s", tableInput);















        } else System.out.println("Goodbye");
    }
}

