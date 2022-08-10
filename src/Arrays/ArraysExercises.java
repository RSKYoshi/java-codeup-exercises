package Arrays;
import java_Two.Person;
import java.util.Arrays;

public class ArraysExercises {
    //exercise below
    public static void main(String[] args) {
        //prints out number array
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));
        //-------
        //-------Another way to do an array----//
//        Person p1 = new Person("Bob");
//        Person p2 = new Person("Jill");
//        Person p3 = new Person("Ryan");
        //array here
//        Person [] persons = {p1,p2,p3};
        //-----------------------------------------//
        //persons array is specified with 3 places for names
//        int n=3;
        Person [] persons = {new Person("Bob"), new Person("Jill"), new Person("Ryan")};
        for (Person person : persons) {
            System.out.println(person.getName());
        }

        //add new person here
        Person newPerson = new Person("Takashi");


        //call method addPerson here, n= 3 places for names; persons = old array; newName adds a new name and returns old array with new name
        persons = addPerson(persons, newPerson);
        System.out.println(Arrays.toString(persons));

        newPerson = new Person("Bob");
        //call method addPerson here, n= 3 places for names; persons = old array; newName adds a new name and returns old array with new name
        persons = addPerson(persons, newPerson);
        System.out.println(Arrays.toString(persons));
        //practice below
        //-------This works below--------//

//        String [] fruits = {"plum", "peach", "tangerine"};
//        System.out.println(fruits[0]);
//        //find quantity of fruits in array
//        System.out.println(fruits.length);
//        //loops over entire fruits array and outputs it
//        for (int i=0; i < fruits.length;i++) {
//            System.out.println(fruits[i]);
//        }
    }
    //out of main method here
    public static Person [] addPerson(Person[] persons, Person newPerson) {
        //add another place for new array item
        Person[] peepsNewArray = new Person[persons.length + 1];
        for (int i = 0; i < persons.length; i++){
            //new copy here
//            peepsNewArray[i]=persons[i];
            peepsNewArray[i] = persons[i];

//            System.out.println(peeps);
        //new array with added person object at end
    }
        peepsNewArray[peepsNewArray.length-1] = newPerson;
        return peepsNewArray;
    }
}
