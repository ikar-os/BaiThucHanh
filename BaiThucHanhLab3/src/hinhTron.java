import java.util.Scanner;


public class hinhTron {
    final float Pi = 3.14f;
    float r;
    float cv;
    float dt;

    public void nhapBanKinh()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ban kinh r: "); r = sc.nextFloat();
    sc.close();
    }

    public void tinhChuvi()
    {
        cv = 2 * r * Pi;
    }    

    public void tinhDienTich()
    {
        dt = r * r * Pi;
    }

    public void inThongso()
    {
        System.out.printf("Chu vi cua hinh tron co r = %f la: %f",r,cv);
        System.out.printf("\nDien tich cua hinh tron co r = %f la: %f",r,dt);

    }
}
