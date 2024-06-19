import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mời bạn nhập họ tên: ");
        String fullname = scanner.nextLine();

        System.out.println("Họ tên của bạn là: " + fullname);

        System.out.println("Mời bạn nhập tuổi: ");
        int age = scanner.nextInt();
        System.out.println("Số tuổi cua bạn là: " + age);
        scanner.nextLine();
        System.out.println("Mời bạn nhập giới tính: ");
        System.out.println("1. Nam");
        System.out.println("2. Nữ");
        int menu = scanner.nextInt();
        Gender gender = null;
        if(menu == 1) {
            gender = Gender.MALE;
        } else if (menu == 2) {
            gender = Gender.FEMALE;
        }
        System.out.println("Gioi tinh cua ban la: "+ gender);

    }
}
