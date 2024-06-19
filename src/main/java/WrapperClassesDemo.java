public class WrapperClassesDemo {
    public static void main(String[] args) {
        // Primitive        Wrapper Class
        // byte             Byte
        // short            Short
        // int              Interger
        // long             Long
        // float            Float
        // double           Double
        // char             Character
        // boolean          Boolean


        //Boxing: Primitive -> Wrapper Class
        int a = 100;
        Integer b = Integer.valueOf(a);

        // Unboxing: Wrapper Class -> Primitive
        Integer x = Integer.valueOf(100);
        int y = x.intValue();

        // Ung dung
        // 1. Kiem tra ky tu in hoa, in thuong...
        System.out.println("Character.isDigit('1') = " + Character.isDigit('1'));
        System.out.println("Character.isUpperCase('a') = " + Character.isUpperCase('a'));
        System.out.println("Character.isAlphabetic('@') = " + Character.isAlphabetic('@'));

        // 2. Chuyen string sang so
        String s = "123456";
        int n = Integer.parseInt(s);
        System.out.println("n = " + n);
    }
}
