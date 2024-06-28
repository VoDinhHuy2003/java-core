package abstraction;

public class AbstractionDemo {
    public static void main(String[] args) {
        // Tính trừu tượng

        //Abstract class
        // Truu tuong khong hoan toan(<100%)
        Circle circle = new Circle(1.0);
        System.out.println("circle = " + circle.area());

        // Interface
        // Truu tuong hoan toan (100%)
        // Mac dinh public abstract

        circle.draw();
        circle.extend();

    }
}
