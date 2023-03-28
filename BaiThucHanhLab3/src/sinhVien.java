import java.util.Scanner;

public class sinhVien {
    String hoten, gioitinh;
    int namsinh, tuoi;

    public void nhapThongTinSv()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho ten sinh vien: "); hoten = sc.nextLine();
        System.out.print("Nhap nam sinh: "); namsinh = sc.nextInt();
        System.out.print("Nhap gioi tinh: "); sc.nextLine();gioitinh = sc.nextLine();
    sc.close();
    }

    public void tinhTuoi()
    {
        tuoi = 2023 - namsinh;
    }

    public void inThongTinSv()
    {
        System.out.printf("\nSinh vien vua nhap co thong tin la:\nHo ten: %s\nNam sinh: %d\nTuoi: %d\nGioi tinh: %s", hoten, namsinh, tuoi, gioitinh);
    }
}
