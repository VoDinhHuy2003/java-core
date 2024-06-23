package exercise05;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class QLCB {
    private Scanner scanner = new Scanner(System.in);
    private List<CanBo> canBoList = new LinkedList<>();

    private void themCanBo() {
        System.out.println("1. Cong nhan");
        System.out.println("2. Ky su");
        System.out.println("3. Nhan vien");
        System.out.println("Chon menu");

        int menu = Integer.parseInt(scanner.nextLine());
        if (menu < 1 || menu > 3) return;
            System.out.println("Nhap vao ho ten: ");
            String hoTen = scanner.nextLine();
            System.out.println("Nhap vao tuoi: ");
            int tuoi = Integer.parseInt(scanner.nextLine());
            System.out.println("Chon gioi tinh");
            System.out.println("1. Nam");
            System.out.println("2. Nu");
            System.out.println("3. Khac");
            GioiTinh gioiTinh;
            String menuGioiTinh = scanner.nextLine();
            if (menuGioiTinh.equals("1")) {
                gioiTinh = GioiTinh.NAM;
            } else if (menuGioiTinh.equals("2")) {
                gioiTinh = GioiTinh.NU;
            } else {
                gioiTinh = GioiTinh.KHAC;
            }
            System.out.println("Nhap vao dia chi: ");
            String diaChi = scanner.nextLine();
        if(menu == 1) {
            System.out.println("Nhap vao bac cong nhan (1 -> 10): ");
            int bac = Integer.parseInt(scanner.nextLine());
            CongNhan congNhan = new CongNhan(hoTen, tuoi, gioiTinh, diaChi, bac);
            canBoList.add(congNhan);
        } else if (menu == 2) {
            System.out.println("Nhap vao nganh dao tao: ");
            String nganhDaoTao = scanner.nextLine();
            KySu kySu = new KySu(hoTen, tuoi, gioiTinh, diaChi, nganhDaoTao);
            canBoList.add(kySu);
        } else {
            System.out.println("Nhap vao cong viec: ");
            String congViec = scanner.nextLine();
            NhanVien nhanVien = new NhanVien(hoTen, tuoi, gioiTinh, diaChi, congViec);
            canBoList.add(nhanVien);
        }

    }

    private void timKiemTheoHoTen() {
        System.out.println("Nhap vao ho ten: ");
        String hoTen = scanner.nextLine();
        for (CanBo canBo : canBoList) {
            if(canBo.hoTen.equals(hoTen)){
                System.out.println(canBo);
            }
        }
    }

    private void hienThiDSCB() {
        for (CanBo canBo : canBoList) {
            System.out.println(canBo);
        }
    }

    private void xoaCanBo() {
        System.out.println("Nhap vao ten can bo can xoa: ");
        String ten = scanner.nextLine();
        Predicate<CanBo> predicate = new Predicate<CanBo>() {
            @Override
            public boolean test(CanBo canBo) {
                int lastIndexOf = canBo.hoTen.lastIndexOf(' ');
                String tenCanBo = canBo.hoTen.substring(lastIndexOf + 1);
                return tenCanBo.equals(ten);
            }
        };
        canBoList.removeIf(predicate);
    }

    public void showMenu() {
        while (true) {
            System.out.println("1. Thêm cán bộ");
            System.out.println("2. Tìm kiếm cán bộ theo họ tên");
            System.out.println("3. Hiển thi danh sach can bo");
            System.out.println("4. Xóa cán bộ theo tên");
            System.out.println("5. Thoát");
            int menu = Integer.parseInt(scanner.nextLine());
            if (menu == 1) {
                themCanBo();
            } else if (menu == 2) {
                timKiemTheoHoTen();
            } else if (menu == 3) {
                hienThiDSCB();
            } else if (menu == 4) {
                xoaCanBo();
            } else if (menu == 5){
                return;
            } else {
                System.out.println("Nhập lại");
            }
        }
    }
}
