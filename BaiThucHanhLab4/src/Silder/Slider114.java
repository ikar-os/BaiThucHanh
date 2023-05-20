package Silder;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import Models.SinhVien;

public interface Slider114 {
    public static void main(String[] args) {
        Map<String, SinhVien> svm = new HashMap<>();
        SinhVien sv = new SinhVien();
        Scanner sc = new Scanner (System.in);
        System.out.print("Nhap so luong sinh vien: ");
        int n = Integer.parseInt(sc.nextLine());
        sv.nhapSinhVien(svm, n, sc);
        sv.showSvLop(svm, sc);
        sv.showSvMSV(svm, sc);
    }
}
