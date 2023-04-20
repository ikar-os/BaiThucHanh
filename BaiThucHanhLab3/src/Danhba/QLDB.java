package Danhba;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLDB implements Function {
    List<Contact> list = new ArrayList<>();

    public QLDB() {

    }

    @Override
    public void NhapThongTin(Scanner sc) {
        while (true) {
            System.out.print("Nhap ten: ");
            String name = sc.nextLine();
            System.out.print("Nhap sdt: ");
            String tel = sc.nextLine();
            Contact contact = new Contact(name, tel);
            list.add(contact);

            System.out.print("\nNhap Y de nhap tiep, nhap N de ve menu: ");
            String chon = sc.nextLine();
            if (chon.equalsIgnoreCase("N")) {
                break;
            }
        }
    }

    @Override
    public void Update(Scanner sc) {
        System.out.print("Vui long nhap ten can cap nhat: ");
        String chon = sc.nextLine();
        Contact tim = null;
        for (Contact contact : list) {
            if(contact.getName().contains(chon)) {
                tim = contact;
                break;
            }
        }

        if(tim == null) {
            System.out.println("Khong tim thay vui long nhap moi:");
            NhapThongTin(sc);
        } else {
            System.out.println("Cap nhap so dien thoai: ");
            tim.setTel(sc.nextLine());
            System.out.println("Da cap nhap so dien thoai!");
            System.out.println("");
        }
    }

    @Override
    public void Delete(Scanner sc) {
        System.out.print("Vui long nhap ten can xoa: ");
        String chon = sc.nextLine();
        Contact tim = null;
        for (Contact contact : list) {
            if(contact.getName().contains(chon)) {
                tim = contact;
                break;
            }
        }
        if(tim == null) {
            System.out.println("Khong tim thay contact!");
        } else {
            list.remove(tim);
            System.out.println("Da xoa thanh cong danh ba!");
        }


    }

    @Override
    public void Search(Scanner sc) {
        System.out.print("Vui long nhap ten can tim: ");
        String chon = sc.nextLine();
        Contact tim = null;
        for (Contact contact : list) {
            if(contact.getName().contains(chon)) {
                tim = contact;
                break;
            }
        }
        if(tim == null) {
            System.out.println("Khong tim thay contact");
        } else {
            System.out.println("Thong tin contact ban tim: ");
            tim.InThongTin();
            
        }
        

    }

}
