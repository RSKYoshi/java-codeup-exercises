package grades;
import org.w3c.dom.ls.LSOutput;
import util.Input;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        Input input = new Input();
//        Create a class named GradesApplication with a main method. Inside the main method, create a HashMap named students.
//        It should have keys that are strings that represent github usernames, and values that are Student objects. Create at least 4 Student objects with at least 3 grades each, and add them to the map.
//        Be creative! Make up GitHub usernames and grades for your student objects.
        // We'll start by defining a hash map
        HashMap<String, Student> students = new HashMap<>();
        //create student object here
        Student Ryan = new Student("Ryan");
        Ryan.addGrade(77,50,40);
        //key, value
        students.put("slantyNinja", Ryan);
        //next student
        Student Bob = new Student("Bob");
        Bob.addGrade(88,30,50);
        students.put("coolBeans360", Bob);
        //next student
        Student Cody = new Student("Cody");
        Cody.addGrade(85,99,40);
        students.put("bestestCodrEvr1990", Cody);
        //next student
        Student Codette = new Student("Codette");
        Codette.addGrade(85,99,40);
        students.put("thyme2Code", Codette);

//        String githubUsernames = String key:students.keySet();

        //print out each student object on new line
//        for (Map.Entry<String,Student> student : students.entrySet()) {
//            System.out.println(student);
//        }



        boolean userYesNo;
        do{
            System.out.printf("%nStudent's Github usernames: ");
//        print out usernames here
            for(String key:students.keySet()){
                System.out.printf("|%s|" + " ", key);
            }
        System.out.printf("%nSelect Github username: ");
//        Scanner sc = new Scanner(System.in);
//        String userSelection = sc.next();
            String userSelection = input.getString();

            if(students.containsKey(userSelection)){
                System.out.printf("%n"+"%n"+"%n"+"%n"+"%n"+"%n"+"%n");
                System.out.println("───────────────────────────────");
                System.out.println("───────────────████─███────────");
                System.out.println("──────────────██▒▒▒█▒▒▒█───────");
                System.out.println("─────────────██▒────────█──────");
                System.out.println("─────────██████──██─██──█──────");
                System.out.println("────────██████───██─██──█──────");
                System.out.println("────────██▒▒▒█──────────███────");
                System.out.println("────────██▒▒▒▒▒▒───▒──██████───");
                System.out.println("───────██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒███─");
                System.out.println("──────██▒▒▒▒─────▒▒▒▒▒▒▒▒▒▒▒▒█─");
                System.out.println("──────██▒▒▒───────▒▒▒▒▒▒▒█▒█▒██");
                System.out.println("───────██▒▒───────▒▒▒▒▒▒▒▒▒▒▒▒█");
                System.out.println("────────██▒▒─────█▒▒▒▒▒▒▒▒▒▒▒▒█");
                System.out.println("────────███▒▒───██▒▒▒▒▒▒▒▒▒▒▒▒█");
                System.out.println("─────────███▒▒───█▒▒▒▒▒▒▒▒▒▒▒█─");
                System.out.println("────────██▀█▒▒────█▒▒▒▒▒▒▒▒██──");
                System.out.println("──────██▀██▒▒▒────█████████────");
                System.out.println("────██▀███▒▒▒▒────█▒▒██────────");
                System.out.println("█████████▒▒▒▒▒█───██──██───────");
                System.out.println("█▒▒▒▒▒▒█▒▒▒▒▒█────████▒▒█──────");
                System.out.println("█▒▒▒▒▒▒█▒▒▒▒▒▒█───███▒▒▒█──────");
                System.out.println("█▒▒▒▒▒▒█▒▒▒▒▒█────█▒▒▒▒▒█──────");
                System.out.println("██▒▒▒▒▒█▒▒▒▒▒▒█───█▒▒▒███──────");
                System.out.println("─██▒▒▒▒███████───██████────────");
                System.out.println("──██▒▒▒▒▒██─────██─────────────");
                System.out.println("───██▒▒▒██─────██──────────────");
                System.out.println("────█████─────███──────────────");
                System.out.println("────█████▄───█████▄────────────");
                System.out.println("──▄█▓▓▓▓▓█▄─█▓▓▓▓▓█▄───────────");
                System.out.println("──█▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▓█──────────");
                System.out.println("──█▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▓█──────────");
                System.out.println("──▀████████▀▀███████▀──────────");
                System.out.printf("%n%n%n%n%n%n%n%n%n%n----------------------------------------------%n");
                System.out.printf("Name: " + students.get(userSelection).getName() +" \uD83D\uDE00");
                System.out.printf("%nGithub username: " + userSelection);
                System.out.printf("%nAll grades: " + students.get(userSelection).grades);
                System.out.printf("%nCurrent grade average: " + students.get(userSelection).getGradeAverage() + "%n");
                System.out.println("----------------------------------------------");
                System.out.print("\u2191" + "Scroll up for art" + "\u2191");





            } else {
                System.out.println("This student does not exist in our database.");
            }
            System.out.printf("%n"+"%n"+"Would you like to see another student?");
            userYesNo = input.yesNo();
            if(!userYesNo){
                System.out.println("Goodbye and have a wonderful day!");
            }
        }while(userYesNo);

// {Ryan=ryanorsinger, Zach=zgulde, Fernando=fmendozaro, Justin=jreich5}

// obtaining values from the hash map by key
//        students.get("Ryan"); // "ryanorsinger"
//        students.get("Bob"); // null
//        students.getOrDefault("Cody", "gocodeup"); // "gocodeup"
//
//// checking if keys or values are present
//        students.containsKey("Ryan"); // true
//        students.containsValue("Cody"); // true



    }



}
