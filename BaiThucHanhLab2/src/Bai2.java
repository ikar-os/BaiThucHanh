import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a ;
        do {
            System.out.print("Nhap so: "); a = sc.nextInt();
        }while(a <= 0);

        if (a % 2 == 0) {
            System.out.printf("So %d la so chan", a);
        } else {
            System.out.printf("So %d la so le", a);
        }
        sc.close();

    }
}
