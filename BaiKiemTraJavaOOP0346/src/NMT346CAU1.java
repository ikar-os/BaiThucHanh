import java.util.List;
import java.util.Scanner;

public class NMT346CAU1 {
    public String Hoten;
    public float Diem;
    public int Tuoi;

    Scanner sc = new Scanner(System.in);
    public void EnterData(List<NMT346CAU1> list, Scanner sc) {
        while (true) {
            NMT346CAU1 sinhvien = new NMT346CAU1();

            System.out.println("===Enter Data===");
            System.out.print("Nhap Hoten:");
            sinhvien.Hoten = sc.nextLine();
            System.out.print("Nhap Tuoi:");
            sinhvien.Tuoi = Integer.parseInt(sc.nextLine());
            System.out.print("Nhap Diem:");
            sinhvien.Diem = Float.parseFloat(sc.nextLine());
            list.add(sinhvien);

            System.out.print("Ban co muon nhap tiep k (Y/N): ");
            String chon = sc.nextLine();
            if (chon.equals("N")) {
                break;
            }
        }
    }

    public void Insert() {

    }

    public void Update(List<NMT346CAU1> list, Scanner sc) {
        String chon;

    }

    public void Delete(List<NMT346CAU1> list, Scanner sc) {
        System.out.print("Nhap Ho ten can xoa:");
        String chon = sc.nextLine();
        
    }

    public void Display(List<NMT346CAU1> list) {
        for (NMT346CAU1 nmt346cau1 : list) {
            System.out.println(nmt346cau1);
        }
    }

    public void SearchByName() {

    }
}
