package generic;

public class Printer {
    public static <T> void PrintAny(T object) {
        System.out.println(object);
    }
}
