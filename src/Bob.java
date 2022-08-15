import java.util.Scanner;


public class Bob {
    public static void main(String[] args) {
        boolean userEnteredStop;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.printf("%nI'm Bob, ask me a question:");
            sc.useDelimiter("\n");
            String userInput = sc.next();
            if(userInput.contains("?")){
                System.out.print("Bob: Sure");
            } else if(userInput.contains("!")){
                System.out.print("Bob: Whoa, chill out!");
            } else if(userInput.length()==0){
                System.out.print("Bob: Fine. Be that way!");
            } else if(userInput.contains("stop")){
                break;
            } else System.out.print("Bob: Whatever");

            String userEnter = sc.next();
            userEnteredStop = userEnter.equals("stop");
        }while(!userEnteredStop);
    }
}
