import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        hinhTron ht = new hinhTron();
        sinhVien sv = new sinhVien();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("1. Hinh tron\n2. Sinh vien\nLua chon cua ban: "); int luachon = sc.nextInt();
        switch(luachon){
            case 1:
                ht.nhapBanKinh();
                ht.tinhChuvi();
                ht.tinhDienTich();
                ht.inThongso();
                break;
            case 2:
                sv.nhapThongTinSv();
                sv.tinhTuoi();
                sv.inThongTinSv();
                break;
            default:
                System.out.println("Vui long lua chon dung!");
        }
    sc.close();
    }
}
