package HinhHoc;

import java.util.Scanner;

public class HinhVuong extends HinhChuNhat {
    public HinhVuong(){
        super.setTen("Hinh Vuong");
    }

    public void NhapCanh(Scanner sc) {
        System.out.print("Nhap canh: ");
        super.setDai(sc.nextFloat());
        super.setRong(super.getDai()); 
    }
}
