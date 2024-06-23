package encapsulation;

public class EncapsulationDemo {
    public static void main(String[] args) {
        // Tinh dong goi
        // 1. Private cac thuoc tinh
        // 2. Cung cap getter / setter

        Cat cat = new Cat("Long", 2);
        System.out.println("cat.getName() = " + cat.getName());
    }
}
