package HinhHoc;
import java.util.Scanner;

public class hinhTru extends hinhTron {
    Scanner sc = new Scanner(System.in);
    public float chieucao;
    public hinhTru() {
        ten = "Hinh tru";
    }
    
    public void nhapChieuCao() {
        nhapBanKinh();
        System.out.print("Nhap chieu cao: "); 
        Scanner sc = new Scanner(System.in);
        chieucao = sc.nextFloat();
    }

    public void tinhTheTich() {
        tinhDienTich();
        theTich = dienTich * chieucao; 
    }

}
