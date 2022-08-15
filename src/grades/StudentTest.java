package grades;

public class StudentTest {
    public static void main(String[] args) {
//        new Student ("Ryan", 100);
        Student Ryan = new Student("Ryan");
        Ryan.addGrade(77);
        Ryan.addGrade(50);
        Ryan.addGrade(40);
        System.out.println(Ryan);
        System.out.println(Ryan.getGradeAverage());
    }
}
