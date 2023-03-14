import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String chuoi;
        do {
            System.out.print("Nhap chuoi (khong qua 80 ki tu): ");
            chuoi = sc.nextLine();
        } while (chuoi.length() > 80);

        System.out.print("Nhap ki tu: ");
        char c = sc.next().charAt(0);

        int demso = 0;
        for (int i = 0; i < chuoi.length(); i++) {
            if (chuoi.charAt(i) == c) {
                demso++;
            }
        }

        System.out.println("so lan xuat hien cua ky tu " + c + " trong chuoi la " + demso);
        sc.close();
    }
}

