package Silder;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Slider111 {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        List<Integer> linkList = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap do dai cua day so: ");
        int n = sc.nextInt();
        NhapSoNguyen(linkList, n, sc);
        TrungBinhCong(linkList, n);
    }

    public static void NhapSoNguyen(List<Integer> list, int n, Scanner sc) {
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap so nguyen thu " + (i + 1) + " :");
            int songuyen = sc.nextInt();
            list.add(songuyen);
        }
    }

    public static void TrungBinhCong(List<Integer> list, int n) {
        int sum = 0;
        int checkChan =0;
        for (int i = 0; i < n; i++) {
            if (list.get(i) % 2 == 0) {
                sum += list.get(i);
                checkChan++;
            }
        }
        float TrungBinh = sum / checkChan;
        System.out.println("Trung binh cong cac so chan la: " + TrungBinh);
    }
}
