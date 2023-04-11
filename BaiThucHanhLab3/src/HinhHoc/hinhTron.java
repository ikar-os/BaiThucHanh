package HinhHoc;

import java.util.Scanner;


public class hinhTron extends HinhHoc {
    public float banKinh;

    public hinhTron(){
        ten = "Hinh tron";
    }

    public void nhapBanKinh()
    {
        System.out.print("Nhap ban kinh r: "); 
        Scanner sc = new Scanner(System.in);
        banKinh = sc.nextFloat();
    }

    public void tinhChuvi()
    {
        chuVi = 2 * banKinh * Pi;
    }    

    public void tinhDienTich()
    {
        dienTich = banKinh * banKinh * Pi;
    }
}
