package Silder;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Slider112 {
    public String hoTen;
    public double diem;

    public void Nhap(List<Slider112> ls, Scanner sc) {
        while (true) {
            Slider112 sv = new Slider112();
            System.out.print("Nhap ten sinh vien: ");
            sv.hoTen = sc.nextLine();
            if (sv.hoTen.equals("")) {
                break;
            }
            System.out.print("Nhap diem sinh vien: ");
            sv.diem = Double.parseDouble(sc.nextLine());
            ls.add(sv);
        }
    }

    public void xuat() {
        System.out.println("" + this.hoTen + "\t" + this.diem);
    }

    public void Check(List<Slider112> ls) {
        int count = 0;
        System.out.println("==========================");
        System.out.println("Sinh vien co diem <= 5 la: ");
        for (Slider112 sinhVien : ls) {
            if (sinhVien.diem <= 5) {
                sinhVien.xuat();
                count++;
            }
        }
        System.out.println("Co tong cong " + count + " sinh vien truot");
    }

    public void DiemCao(List<Slider112> ls) {
        ls.sort((o1, o2) -> (int) (o2.diem - o1.diem));
        double max = ls.get(0).diem;
        System.out.println("==============================");
        System.out.println("Sinh vien co diem cao nhat la: ");
        for (Slider112 sinhVien : ls) {
            if (sinhVien.diem == max) {
                sinhVien.xuat();
            }
        }

    }

    public void TimKiem(List<Slider112> ls, Scanner sc) {
        System.out.println("=========================");
        System.out.print("Nhap ten sinh vien can tim: ");
        String tim = sc.nextLine();
        Slider112 svTim = null;
        for (Slider112 sinhVien : ls) {
            if (sinhVien.hoTen.contains(tim)) {
                svTim = sinhVien;
                break;
            }
        }
        if (svTim != null) {
            System.out.println("Sinh vien can tim la: ");
            svTim.xuat();
        } else {
            System.out.println("Khong tim thay sinh vien!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Slider112> ls = new LinkedList<>();
        Slider112 sv = new Slider112();
        sv.Nhap(ls, sc);
        sv.Check(ls);
        sv.DiemCao(ls);
        sv.TimKiem(ls, sc);
    }

}
