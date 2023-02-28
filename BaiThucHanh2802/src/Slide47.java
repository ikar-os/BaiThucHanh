import java.util.Scanner;

public class Slide47 {
    public static void main (String[] args){
        int a; int tong = 0;
        String dayso = "";
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.print("Nhap so nguyen: " );
            a = sc.nextInt();
            tong += a;
            dayso += a + " + ";
        }
        while(tong < 100);

        dayso = dayso.substring(0, dayso.length()-2);
        System.out.print("Tong cac so nguyen vua nhap la: " +dayso +"= " +tong);
        sc.close();
    }
}
