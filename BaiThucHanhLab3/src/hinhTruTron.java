import java.util.Scanner;

public class hinhTruTron {
    Scanner sc = new Scanner(System.in);
    final float Pi = 3.14f;
    float r, h, cv, dt, V;
    
    public void nhapBanKinh() {
        System.out.print("Nhap ban kinh: "); r = sc.nextFloat();
    }
    
    public void nhapChieuccao() {
        System.out.print("Nhap chieu cao: "); h = sc.nextFloat();
    }

    public void tinhChuvi() {
        cv = 2*Pi*r*h;
    }

    public void tinhDienTich() {
        dt = 2*Pi*r*h + 2*Pi*r*r;
    }

    public void tinhTheTich() {
        V = Pi*r*r*h; 
    }

    public void InThongTin() {
        System.out.println("Thong tin hinh tru la:");
        System.out.printf("Ban kinh (r) = %f",r);
        System.out.printf("\nChieu cao (h) = %f",h);
        System.out.printf("\nChu vi = %f",cv);
        System.out.printf("\nDien tich = %f",dt);
        System.out.printf("\nThe tich = %f",V);

    }
}
