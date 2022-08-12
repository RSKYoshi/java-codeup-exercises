package java_One.src.gameDev101;

import java.util.Scanner;

public class HighLow {
    static int rollNum = (int) ((Math.random() * 100) +1);
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
//        int rollNum = (int) ((Math.random() * 100) +1);
        System.out.println(rollNum);
        guessNum();
    }

    public static void guessNum(){
        System.out.println("Guess a number: ");
        int userGuess = Integer.parseInt(sc.next());
        if(userGuess<rollNum){
            System.out.println("HIGHER");
            guessNum();
        } else if(userGuess>rollNum){
            System.out.println("LOWER");
            guessNum();
        } else System.out.println("GOOD GUESS!");
    }
}
//TODO make this an if/else to prompt user if they want to play another game
