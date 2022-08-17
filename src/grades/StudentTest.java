package grades;

public class StudentTest {
    public static void main(String[] args) {
//        new Student ("Ryan", 100);
        Student Ryan = new Student("Ryan");
        Ryan.addGrade(77,50,40);
        System.out.println(Ryan);
        System.out.println(Ryan.getGradeAverage());
    }
}
