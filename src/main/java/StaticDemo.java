public class StaticDemo {
    public static void main(String[] args) {
        // static property
        Student student1 = new Student(1, "Huy");
        Student student2 = new Student(2, "Duy");
        Student student3 = new Student(3, "Bao");
        System.out.println("So luong hoc sinh: " + Student.getCount());
        // static method
    }
}
