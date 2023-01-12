package grades;

import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student("Luke");
        student.addGrade(55);
        student.addGrade(99);
        student.addGrade(25);
        System.out.println("student.getName() = " + student.getName());
        System.out.println("student.getGradeAverage() = " + student.getGradeAverage());

    }
}
