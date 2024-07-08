public class Student {
    private int id;
    private String name;

    private static int count;

    public Student(int id, String name) {

        this.id = ++count;
        this.name = name;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
