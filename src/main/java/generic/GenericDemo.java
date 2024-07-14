package generic;

public class GenericDemo {
    public static void main(String[] args) {
        //Quy uoc
        // T - Type
        // E - Element
        // N - Number
        // K - Key
        // V - Value

        // generic class/ interface
        Dog<Integer> dog1 = new Dog<>("Long", 1);
        System.out.println(dog1);
        Dog<Double> dog2 = new Dog<>("Ha", 2.5);
        System.out.println(dog2);

        // generic method
        Printer.PrintAny(4.5);
        Printer.PrintAny(dog1);

//        Dog<T> dog3 = new Dog<>("Tung", 15);

        // multiple generic
        int max = Math.max(1, 99);
        System.out.println(max);
    }
}
