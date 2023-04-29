import java.util.HashSet;
import java.util.Scanner;

public class Slider54 {
    public static void main(String[] args) {
        int number;
        HashSet<Integer> hashSetInteger = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        hashSetInteger.add(0);
        hashSetInteger.add(3);
        hashSetInteger.add(1);
        hashSetInteger.add(4);
        hashSetInteger.add(2);
        hashSetInteger.add(8);

        System.out.print("Cac phan tu trong hashSetInterger: ");
        System.out.print(hashSetInteger);
        System.out.print("\nNhap cac phan tu can them: ");
        number = sc.nextInt();

        if (!hashSetInteger.contains(number)) {
            hashSetInteger.add(number);
            System.out.println("them thanh cong");
            System.out.println("Cac phan tu trong hashSetInterger sau khi them: ");
            System.out.print(hashSetInteger);
        } else {
            System.out.println("Phan tu " + number + " da ton tai!");
        }
    }

}
