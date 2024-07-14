package comparing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student(7, "Huy"));
        students.add(new Student(2, "Tien"));
        students.add(new Student(4, "Hoang"));
        students.add(new Student(1, "Anh"));
        students.add(new Student(1, "Huy"));

        Collections.sort(students);
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
