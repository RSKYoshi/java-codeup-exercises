package java_Two;
import java.util.Scanner;

public class Person {
    @Override
    public String toString() {
        return name;
    }

    private String name;

    public Person(String name) {
        this.name = name;
    }

    //constructor here
    public void setName(String name){
//TODO: change the name field to the passed value
        this.name=name;
    }

    public String getName(){
//TODO: return the person's name
        return name;
    }

    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.printf("Hello" + " " + name + "!%n");
    }


    public static void main(String[] args) {
        //I believe where "ryan" is located, that is the place to put user input
//        Person myself = new Person("ryan");
//        myself.sayHello();
//        setName("ryan");
        System.out.printf("%nPlease enter your name: ");
        //declare scanner, then listen for user input//
        Scanner sc = new Scanner(System.in);
        String userInput = sc.next();
        //assign user input as a parameter to a new Person object
        Person userName = new Person(userInput);
        userName.sayHello();


        //-------below is for testing-------//

//        Person person1 = new Person("John");
        //comment line: creating new object here
//        Person person2 = new Person("John");
        //true, because "John" equals "John"
//        System.out.println(person1.getName().equals(person2.getName()));
        //comment line:   false because it does not refer to the same string memory?
        //comment line:   here it is false because person 2 is replacing person 1, instead of person 2 becoming a copy that I can compare person 1 to
        //                also false because I created a new object, instead of comparing the one object I created to itself
//        System.out.println(person1 == person2);


//        Person person1 = new Person("John");
//        Person person2 = person1;
        //comment line: true because now I only created one object to compare itself to
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
        //comment line here: Since I only created 1 object above, person 2 will equal person 1 at this point
//        Person person2 = person1;
        //comment line here: Will print out 2x "John" here
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
        //comment line here: initialized name to be "Jane" here
//        person2.setName("Jane");
        //comment line here: Will print out 2x "Jane" here
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());

        //--------end of testing-------//

    }
}
