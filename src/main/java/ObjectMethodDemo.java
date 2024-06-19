public class ObjectMethodDemo {
    public static void main(String[] args) {
        // toString
        Dog dog = new Dog();
        dog.name = "Tun";
        dog.age = 10;
        System.out.println("dog = " + dog);

        // hashCode


        // equals
        Dog dog1 = new Dog();
        dog1.name = "Tun";
        dog1.age = 10;
        Dog dog2 = new Dog();
        dog2.name = "Tun";
        dog2.age = 10;

        System.out.println(dog1.equals(dog2));
    }
}
