import java.util.Scanner;

import HinhHoc.HinhChuNhat;
import HinhHoc.HinhTru;
import HinhHoc.HinhVuong;
import HinhHoc.HinhTron;


public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HinhTron ht = new HinhTron();
        ht.XuatTen();
        ht.NhapBanKinh(sc);
        ht.tinhChuvi();
        ht.tinhDienTich();
        ht.InChuVi();
        ht.InDienTich();

        HinhTru hTru = new HinhTru();
        hTru.XuatTen();
        hTru.NhapBanKinh(sc);
        hTru.NhapChieuCao(sc);
        hTru.tinhTheTich();
        hTru.InTheTich();;

        HinhChuNhat hcn = new HinhChuNhat();
        hcn.XuatTen();
        hcn.NhapChieuDai(sc);
        hcn.NhapChieuRong(sc);
        hcn.TinhChuVi();
        hcn.tinhDienTich();
        hcn.InChuVi();
        hcn.InDienTich();

        HinhVuong hv = new HinhVuong();
        hv.XuatTen();
        hv.NhapCanh(sc);
        hv.TinhChuVi();
        hv.tinhDienTich();
        hv.InChuVi();
        hv.InDienTich();

    }
}
