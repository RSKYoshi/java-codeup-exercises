package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    //constructor here to set name ang grades property
    public Student(String name, int grades) {
        this.name = name;
        this.grades = new ArrayList<Integer>();
    }

    //array list of integers here
    public ArrayList <Integer> grades(){
        return new ArrayList<Integer>();
        //add grade here?
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
        int average = 0;
        for (int i = 0; i < grades.size(); i++) {
            int gradesSum = 0;
            gradesSum += grades.get(i);
            average = gradesSum / grades.size();
        }
        return average;
    }

}
