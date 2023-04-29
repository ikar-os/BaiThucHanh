import java.util.ArrayList;
import java.util.Scanner;

public class Slider22 {
    public static void main(String[] args) {
        ArrayList<Integer> arrlist = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int number;

        System.out.print("nhap vao kich thuoc mang: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.printf("Nhap vao phan tu a[%d]: ", i);
            number = sc.nextInt();
            arrlist.add(number);
        }

        System.out.print("Phan tu trong mang la: ");
        for (Integer integer : arrlist) {
            System.out.print(integer + "\t");
        }

        int max = arrlist.get(0);
        for (int i = 0; i < arrlist.size(); i++) {
            if (arrlist.get(i).compareTo(max) > 0) {
                max = arrlist.get(i);
            }
        }
        System.out.println("Phan tu lon nhat trong mang la : " + max);
    }
}
