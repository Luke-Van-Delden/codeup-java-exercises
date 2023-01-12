package grades;
import java.util.*;


public class Student {
    private String name;
    private ArrayList<Integer> grades;
    private double total;


    public Student(String name, ArrayList<Integer> grades) {
        this.name = name;
        this.grades = grades;
    }

    // returns the student's name
    public String getName(){
        return name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade){
        this.grades.add(grade);
    }
    // returns the average of the students grades
    public double getGradeAverage(){
        for(int i = 0; i < this.grades.size(); i++){
            total += this.grades.get(i);
        }
        return total / this.grades.size();
    }
}
