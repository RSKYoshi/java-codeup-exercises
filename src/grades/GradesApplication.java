package grades;
import java.util.HashMap;
import java.util.Map;

public class GradesApplication {
    public static void main(String[] args) {
//        Create a class named GradesApplication with a main method. Inside the main method, create a HashMap named students.
//        It should have keys that are strings that represent github usernames, and values that are Student objects. Create at least 4 Student objects with at least 3 grades each, and add them to the map.
//        Be creative! Make up GitHub usernames and grades for your student objects.

        // We'll start by defining a hash map
        HashMap<String, Student> students = new HashMap<>();
        //create student object here
        Student Ryan = new Student("Ryan");
        Ryan.addGrade(77);
        Ryan.addGrade(50);
        Ryan.addGrade(40);
        students.put("slantyNinja", Ryan);
        //next student
        Student Bob = new Student("Bob");
        Bob.addGrade(88);
        Bob.addGrade(50);
        Bob.addGrade(30);
        students.put("coolBeans360", Bob);
        //next student
        Student Cody = new Student("Cody");
        Cody.addGrade(85);
        Cody.addGrade(99);
        Cody.addGrade(40);
        students.put("bestestCodrEvr1990", Cody);
        //next student
        Student Codette = new Student("Codette");
        Codette.addGrade(85);
        Codette.addGrade(99);
        Codette.addGrade(40);
        students.put("thyme2Code", Codette);


        System.out.println(students);
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


    //TODO: when sout students, print out each students gpa in their object
//    public int gradeAverage{
//        for (Map.Entry<String,Student> student : students.entrySet()) {
//            return student.getGradeAverage();
//        }
//    }




}
