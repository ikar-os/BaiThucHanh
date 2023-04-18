package HinhHoc;
import java.util.Scanner;

public class HinhChuNhat extends HinhHoc{
    private float rong;
    private float dai;
    
    public float getRong() {
        return rong;
    }

    public void setRong(float rong) {
        this.rong = rong;
    }

    public float getDai() {
        return dai;
    }

    public void setDai(float dai) {
        this.dai = dai;
    }

    public HinhChuNhat() {
        super.setTen("Hinh Chu Nhat");
    }

    public void NhapChieuDai(Scanner sc) {
        System.out.print("Nhap chieu dai: ");
        setDai(sc.nextFloat());
    }

    public void NhapChieuRong(Scanner sc) {
        System.out.print("Nhap chieu rong: ");
        setRong(sc.nextFloat());
    }

    public void TinhChuVi() {
        float  chuVi = 2 * (dai + rong);
        setChuVi(chuVi);
    }

    public void tinhDienTich() {
        float dienTich = dai * rong;
        setDienTich(dienTich);
    }

}
