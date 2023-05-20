package Silder;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Slider113 {
    Set<String> traicay = new HashSet<>();

    public void NhapTraiCay(Scanner sc) {
        System.out.println("===Nhap trai cay===");
        while (true) {
            System.out.print("Nhap ten trai cay: ");
            String name = sc.nextLine();
            traicay.add(name);
            System.out.print("Trai cay hien co: ");
            System.out.println(traicay);
            if (name.equalsIgnoreCase("")) {
                break;
            }
        }
    }

    public void TimKiemTraiCay(Scanner sc) {
        System.out.println("===Tim kiem trai cay===");
        System.out.print("Nhap vao trai cay can tim: ");
        String timtraicay = sc.nextLine();
        if (traicay.contains(timtraicay)) {
            System.out.println("trai cay ban tim da co trong danh sach");
        } else {
            System.out.println("Khong tim thay trai cay trong danh sach");
        }
        System.out.print("Trai cay hien co: ");
        System.out.println(traicay);
    }

    public void XoaTraiCay(Scanner sc) {
        System.out.println("===Xoa trai cay===");
        System.out.print("Nhap ten trai cay can xoa: ");

        String xoatraicay = sc.nextLine();
        if (traicay.contains(xoatraicay)) {
            traicay.remove(xoatraicay);
            System.out.println("Da xoa thanh cong trai cay");
        } else {
            System.out.println("Khong tim thay trai cay can xoa");
        }
        System.out.print("Trai cay hien co: ");
        System.out.println(traicay);
    }

    List<String> listHoaQua = new ArrayList<>();

    public void fakeData() {
        listHoaQua.add("Qua xoai");
        listHoaQua.add("Qua dao");
        listHoaQua.add("Qua nho");
        listHoaQua.add("Qua bao");
    }

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        Slider113 hoaqua = new Slider113();
        hoaqua.NhapTraiCay(sc);
        hoaqua.TimKiemTraiCay(sc);
        hoaqua.XoaTraiCay(sc);
        System.out.println("Cac phan tu trong list da them vao hashset va phan tu co san la: ");
        hoaqua.fakeData();
        hoaqua.traicay.addAll(hoaqua.listHoaQua);

        Iterator<String> itr = hoaqua.traicay.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("Cac phan tu cua hashset sau khi xoa phan tu cua list trong hashset la: ");
        hoaqua.traicay.removeAll(hoaqua.listHoaQua);
        for (String fruit : hoaqua.traicay) {
            System.out.println(fruit);
        }
    }
}
