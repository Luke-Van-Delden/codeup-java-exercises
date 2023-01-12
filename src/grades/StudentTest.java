package grades;

import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {
        ArrayList<Integer> grades = new ArrayList<>();
        grades.add(10);
        grades.add(100);
        grades.add(95);
        Student student = new Student("Luke", grades);
        System.out.println("student.getName() = " + student.getName());
        System.out.println("student.getGradeAverage() = " + student.getGradeAverage());

    }
}
