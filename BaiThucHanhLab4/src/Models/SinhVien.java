package Models;

import java.util.Map;
import java.util.Scanner;

public class SinhVien {
    public String maSv;
    public String hoTen;
    public String lop;

    Scanner sc = new Scanner(System.in);

    public void nhapSinhVien(Map<String, SinhVien> svm, int n, Scanner sc) {
        System.out.println("===Nhap sinh vien===");
        for (int i = 0; i < n; i++) {
            SinhVien sinhVien = new SinhVien();
            System.out.println("Nhap thong tin");
            System.out.print("Ma sinh vien: ");
            sinhVien.maSv = sc.nextLine();
            System.out.print("Ho ten: ");
            sinhVien.hoTen = sc.nextLine();
            System.out.print("Lop: ");
            sinhVien.lop = sc.nextLine();
            svm.put(sinhVien.maSv, sinhVien);
        }
    }

    public void hienThi() {
        System.out.println("MSV: " + maSv + "\tHoten: " + hoTen + "\tLop: " + lop);
    }

    public void showSvLop(Map<String, SinhVien> svm, Scanner sc) {
        System.out.print("Nhap ten lop: ");
        String lopNhap = sc.nextLine();

        System.out.println("Cac sinh vien thuoc lop " + lopNhap + " la:");
        for (SinhVien sinhVien : svm.values()) {
            if (sinhVien.lop.equals(lopNhap)) {
                sinhVien.hienThi();
            }
        }
    }

    public void hienThiSV(Map<String, SinhVien> svm) {
        for (SinhVien sinhVien : svm.values()) {
            sinhVien.hienThi();
        }
    }

    public void showSvMSV(Map<String, SinhVien> svm, Scanner sc) {
        System.out.print("Nhap ma sinh vien: ");
        String msvNhap = sc.nextLine();

        System.out.println("thong tin sinh vien co ma " + msvNhap + " la:");
        for (SinhVien sinhVien : svm.values()) {
            if (sinhVien.lop.equals(msvNhap)) {
                sinhVien.hienThi();
            }
        }
    }
}
