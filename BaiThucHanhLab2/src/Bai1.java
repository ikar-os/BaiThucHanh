import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a, b;
        System.out.print("Nhap so thu 1: ");
        a = sc.nextFloat();
        System.out.print("Nhap so thu 2: ");
        b = sc.nextFloat();
        System.out.printf("Tong cua 2 so la %.2f + %.2f = %.2f",a,b,a+b);
        System.out.printf("\nHieu cua 2 so la %.2f - %.2f = %.2f",a,b,a-b);
        System.out.printf("\nTich cua 2 so la %.2f * %.2f = %.2f",a,b,a*b);
        System.out.printf("\nThuong cua 2 so la %.2f / %.2f = %.2f",a,b,a/b);
        System.out.printf("\nPhan du cua 2 so = %.2f",a%b);
        if(a > b) {
        System.out.printf("\nSo %.2f lon hon so %.2f",a,b);
        } 
        else if( a < b) {
        System.out.printf("\nSo %.2f nho hon so %.2f",a,b); 
        }
        else{
            System.out.printf("\nSo %.2f bang so %.2f",a,b);
        }
        sc.close();

    }
}
