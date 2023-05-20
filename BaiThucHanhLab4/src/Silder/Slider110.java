package Silder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Slider110 {
    List<Integer> arrlist = new ArrayList<>();

    public static void main(String[] args) {
        List<Integer> arrlist = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap do dai day so nguyen: ");
        int n = sc.nextInt();
        NhapSoNguyen(arrlist, n, sc);
        SapXep(arrlist);
        XoaSoNguyen(arrlist, sc);
        System.out.print("Sap xep giam dan: ");
        for (Integer integer : arrlist) {
            System.out.print(integer + "\t");
        }

    }

    public static void NhapSoNguyen(List<Integer> list, int n, Scanner sc) {
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap so nguyen thu " + (i + 1) + " :");
            int songuyen = sc.nextInt();
            list.add(songuyen);
        }
    }

    public static void SapXep(List<Integer> list) {

        System.out.println("");
        list.sort((o1, o2) -> o2 - o1);

    }

    public static void XoaSoNguyen(List<Integer> list, Scanner sc) {
        System.out.print("Nhap so nguyen muon xoa: ");
        int tim = sc.nextInt();
        int xoa = 0;
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) == tim) {
            list.remove(i);
            } else {
                System.out.println("so vua nhap k co trong danh sach");
            } 
        }
    }
}
