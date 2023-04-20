import java.util.Scanner;

import Danhba.QLDB;

public class Quanlidanhba {
    public static void main(String[] args) {
        QLDB qldb = new QLDB();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("===Quan ly danh ba===");
            System.out.println("1. Tao moi mot lien he");
            System.out.println("2. Cap nhat mot danh ba");
            System.out.println("3. Xoa mot lien he");
            System.out.println("4. Tim kiem mot danh ba");
            System.out.println("0. Thoat");
            System.out.print("Moi ban lua chon: ");
            String chon = sc.nextLine();
            switch (chon) {
                case "1":
                    System.out.println("===Nhap thong tin===");
                    qldb.NhapThongTin(sc);
                    System.out.println("");
                    break;
                case "2":
                    System.out.println("===Cap nhat thong tin===");
                    qldb.Update(sc);
                    System.out.println("");
                    break;
                case "3":
                    System.out.println("===Xoa contact===");
                    qldb.Delete(sc);
                    System.out.println("");
                    break;
                case "4":
                    System.out.println("===Tim kiem va xuat contact===");
                    qldb.Search(sc);
                    System.out.println("");
                    break;
                case "0":
                    System.out.println("===The end===");
                    break;
                default:
                    System.out.println("Khong co chuc nang nay, vui long nhap lai!");
                    System.out.println("");
                    break;

            }
            if(chon.equals("0")){
                System.exit(0);
            }
        } while (true);
    }
}
