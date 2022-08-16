package grades;

import java.util.ArrayList;
import java.util.Map;

public class Student {
    private String name;
    public ArrayList<Integer> grades;

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
        double gradesSum = 0;
        double average = 0;
        for (double i = 0; i < grades.size(); i++) {
            double totalQuantity = grades.size();
            gradesSum += grades.get((int) i);
            average = gradesSum / totalQuantity;
        }
        return average;
    }
}

