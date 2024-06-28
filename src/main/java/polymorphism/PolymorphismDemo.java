package polymorphism;

public class PolymorphismDemo {
    public static void main(String[] args) {
        // tính đa hình
        // Student -> Person
        Student student = new Student("Huy", 21);
        student.run();
        Person person = student;
        person.run();

        //instanceof
        boolean isStudent = person instanceof Student;
        System.out.println("isStudent = " + isStudent);
    }
}
