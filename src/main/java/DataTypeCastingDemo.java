public class DataTypeCastingDemo {
    public static void main(String[] args) {
        // Widening
        // byte -> short -> int -> long -> float -> double
        byte  a = 10;
        int b = a;
        System.out.println("b = " + b);
        System.out.println("a = " + a);

        // Narrowing
        //doule -> float -> long -> int -> short -> byte
        long m = 10;
        int n = (int) m;
        System.out.println("m = " + m);
        System.out.println("n = " + n);
    }
}
