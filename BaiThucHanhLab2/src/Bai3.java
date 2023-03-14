import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hoten;
        int namsinh;
        System.out.print("Nhap ho ten: "); hoten = sc.nextLine();
        System.out.print("Nhap nam sinh: "); namsinh = sc.nextInt();
        int tuoi = 2023 - namsinh;
        System.out.printf("So tuoi cua ban la: %d\n", tuoi);
        if (tuoi < 16) {
            System.out.printf("Ban %s o do tuoi vi thanh nien", hoten);
        } else if (tuoi >= 16 & tuoi <= 18) {
            System.out.printf("Ban %s o do tuoi truong thanh", hoten);
        } else {
            System.out.printf("Ban %s da gia", hoten);
        }
        sc.close();
    }
}
