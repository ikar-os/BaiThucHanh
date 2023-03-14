import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i, tong = 0;
        float trungbinh;
        String dayso = "";

        System.out.print("Nhap vao kich thuoc cua day so: ");
        n = sc.nextInt();

        int arrA[] = new int [n];   

        for(i = 0; i < n; i++){
            System.out.printf("Nhap vao gia tri thu %d: ", i+1);
            arrA[i] = sc.nextInt();
            tong += arrA[i];
            dayso += arrA[i] + " + ";
        }

        dayso = dayso.substring(0, dayso.length()-3);
        trungbinh = (float)tong / n;
        System.out.printf("Trung binh cong cua %d so nguyen da nhap la: (%s)/%d = %.2f", n, dayso,n, trungbinh);
    }
}
