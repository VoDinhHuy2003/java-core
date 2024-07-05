package util;

import java.util.Scanner;

public class ScannerUtil {
    private static Scanner scanner = new Scanner(System.in);

    public static int inputInt(){
        while (true) {
            try {
                String input = scanner.nextLine();
                return Integer.parseInt(input);
            } catch (NumberFormatException exception) {
                System.out.println("Yeu cau nhap vao so nguyen.");
                System.out.println("Nhap lai");
            }
        }
    }

    public static int inputPositiveInt() {
        while (true) {
            try{
                String input = scanner.nextLine();
                int n = Integer.parseInt(input);
                if(n > 0) {
                    return n;
                }
                else {
                    System.out.println("Yeu cau nhap vao so nguyen duong.");
                    System.out.println("Nhap lai: ");
                }
            } catch (NumberFormatException exception){
                System.out.println("Yeu cau nhap vao so nguyen duong.");
                System.out.println("Nhap lai: ");
            }
        }
    }

    public static String inputString() {
        return scanner.nextLine();
    }

    public static String inputEmail() {
        while (true) {
            try {
                String input = scanner.nextLine();
                if(input.contains("@")) {
                    return input;
                } else {
                    System.out.println("Yeu cau nhap vao email.");
                    System.out.println("Nhap lai");
                }
            } catch (Exception exception) {
                System.out.println("Yeu cau nhap vao email.");
                System.out.println("Nhap lai");
            }
        }
    }

    public static String inputPassword() {
        while (true) {
            String input = scanner.nextLine();
            int length = input.trim().length();
            if (length >= 6 && length <= 12) {
                for (int i = 0; i < length; i++) {
                    char c = input.charAt(i);
                    if(Character.isUpperCase(c)) {
                        return input;
                    }
                }
                System.out.println("Mat khau phai chua 1 ki tu viet hoa");
            } else {
                System.out.println("Mat khau phai chua 6-12 ki tu");
            }
        }
    }

    public static String inputFullname() {
        while (true) {
            String input = scanner.nextLine();
            int length = input.length();
            if (hasAllAlphabetic(input)) {
                return input;
            } else {
                System.out.println("Yeu cau ho ten chi chua ky tu chu cai");
                System.out.println("Nhap lai");
            }
        }
    }

    private static boolean hasAllAlphabetic(String s) {
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if(Character.isWhitespace(c)) continue;
            if (!Character.isAlphabetic(c)) {
                return false;
            }
        }
        return true;
    }
}
