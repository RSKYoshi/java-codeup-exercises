package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    @Override
    public String toString() {
        return name + grades;
    }

    //constructor here to set name and grades property
    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName() {
        return name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        //loop here and get average
        int gradesSum = 0;
        int average = 0;
        for (int i = 0; i < grades.size(); i++) {
            int totalQuantity= grades.size();
            gradesSum += grades.get(i);
            average = gradesSum / totalQuantity;
        }
        return average;
    }

}