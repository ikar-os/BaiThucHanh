import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, giaithua = 1;
        String daygiaithua = ""; 
        do {
            System.out.print("Nhap vao so nguyen duong: ");
            a = sc.nextInt();
        } while (a < 0);
        for(int i = 1; i <= a; i++ ){
            giaithua *= i;
            daygiaithua +=i + " * ";
        }
        daygiaithua = daygiaithua.substring(0, daygiaithua.length()-2);
        System.out.printf("Giai thua cua so %d la %s = %d", a, daygiaithua, giaithua);
    sc.close();
    }
}
