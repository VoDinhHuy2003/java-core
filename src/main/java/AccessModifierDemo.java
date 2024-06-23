import entity.Dog;

public class AccessModifierDemo {
    public static void main(String[] args) {
        // Pham vi truy cap
        //  public: truy cap dc tu moi noi
        Dog dog = new Dog("Tun", 2);
        System.out.println("dog = " + dog);

        // protected: cung package hoac class con


        // default: cung package
        // private: cung class
    }
}
