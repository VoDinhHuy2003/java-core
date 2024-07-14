package comparing;

public class Student implements Comparable<Student>{
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student that) {
        // ORDER BY id ASC
        //return Integer.compare(this.id, that.id);

        // ORDER BY id DESC
        //return Integer.compare(that.id, this.id);

        // ORDER BY name ASC
        //return this.name.compareTo(that.name);

        int c1 = Integer.compare(this.id, that.id);
//        if (c1 == 0) {
//            return that.name.compareTo(this.name);
//        }
//        return c1;
        return c1 == 0 ? that.name.compareTo(this.name) : c1;
    }
}
