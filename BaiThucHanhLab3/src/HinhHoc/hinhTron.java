package HinhHoc;

import java.util.Scanner;


public class HinhTron extends HinhHoc {
    private float banKinh;

    public void setBanKinh(float banKinh) {
        this.banKinh = banKinh;
    }

    public float getBanKinh() {
        return banKinh;
    }

    public HinhTron() {
        super.setTen("Hinh Tron");
    }

    public void NhapBanKinh(Scanner sc){
        System.out.print("Nhap ban kinh: ");
        setBanKinh(sc.nextFloat());
    }

    public void tinhChuvi() {
        float chuVi = 2 * banKinh * super.getPi();
        super.setChuVi(chuVi);
    }

    public void tinhDienTich() {
        float dienTich = (float) Math.pow(banKinh, 2) * super.getPi();
        super.setDienTich(dienTich);
    }

}
