package Exercise01;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TuyenSinh implements ITuyenSinh{

    private Scanner scanner = new Scanner(System.in);
    private List<ThiSinh> thiSinhhList = new LinkedList<>();

    public void showMenu() {
        while (true) {
            System.out.println("1. Them thi sinh");
            System.out.println("2. Hien thi danh sach thi sinh");
            System.out.println("3. Tim kiem thi sinh theo so bao danh");
            System.out.println("4. Thoat chuong trinh");
            System.out.println("Moi ban chon chuc nang");
            int menu = Integer.parseInt(scanner.nextLine());
            if (menu == 1){
                themThiSinh();
            } else if (menu == 2) {
                hienThiDSTS();
            } else if (menu == 3) {
                timKiemThiSinhTheoSBD();
            } else if (menu == 4){
                return;
            } else {
                System.out.println("Moi ban chon lai chuc nang");
            }
        }
    }

    @Override
    public void themThiSinh() {
        System.out.println("Nhap vao so bao danh: ");
        int soBaoDanh = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap vao ho ten: ");
        String hoTen = scanner.nextLine();
        System.out.println("Nhap vao dia chi: ");
        String diaChi = scanner.nextLine();
        System.out.println("Nhap vao muc uu tien");
        int mucUuTien = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap vao khoi thi: ");
        String khoiThi = scanner.nextLine();
        ThiSinh thiSinh;
        if(khoiThi.equals("A")) {
            thiSinh = new ThiSinhKhoiA(soBaoDanh,hoTen, diaChi, mucUuTien);
        } else if(khoiThi.equals("B")) {
            thiSinh = new ThiSinhKhoiB(soBaoDanh,hoTen, diaChi, mucUuTien);
        } else {
            thiSinh = new ThiSinhKhoiC(soBaoDanh,hoTen, diaChi, mucUuTien);
        }
        thiSinhhList.add(thiSinh);
    }

    @Override
    public void hienThiDSTS() {
        System.out.println("+------+----------------+--------------------+------+----------------+");
        System.out.println("| SBD  |  HO TEN        | DIA CHI            | MUT  |  MONTHI        |");
        System.out.println("+------+----------------+--------------------+------+----------------+");

        for (ThiSinh thiSinh : thiSinhhList) {
            System.out.printf("| %-4s | %-14s | %-18s | %-4s | %-14s |%n",
                    thiSinh.soBaoDanh, thiSinh.hoTen, thiSinh.diaChi, thiSinh.mucUuTien, thiSinh.monThi()
            );
        }
    }

    @Override
    public void timKiemThiSinhTheoSBD() {
        System.out.println("Nhap vao so bao danh de tim kiem: ");
        int soBaoDanh = Integer.parseInt(scanner.nextLine());
        System.out.println("+------+----------------+--------------------+------+----------------+");
        System.out.println("| SBD  |  HO TEN        | DIA CHI            | MUT  |  MONTHI        |");
        System.out.println("+------+----------------+--------------------+------+----------------+");

        for (ThiSinh thiSinh : thiSinhhList) {
            if (soBaoDanh == thiSinh.soBaoDanh){

                System.out.printf("| %-4s | %-14s | %-18s | %-4s | %-14s |%n",
                        thiSinh.soBaoDanh, thiSinh.hoTen, thiSinh.diaChi, thiSinh.mucUuTien, thiSinh.monThi()
                );

            }
        }
    }
}
