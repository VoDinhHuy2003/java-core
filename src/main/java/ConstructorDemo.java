import entity.Dog;

public class ConstructorDemo {
    public static void main(String[] args) {
        // Constructor: Khoi tao ham

        Dog dog = new Dog("Tun", 2);
        System.out.println("dog = " + dog);

        Dog dog1 = new Dog();
        System.out.println("dog1 = " + dog1);
    }
}
