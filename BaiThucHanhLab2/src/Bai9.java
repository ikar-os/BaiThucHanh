import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap chuoi: ");
        String nhapchuoi = sc.nextLine();

        int chuthuong = 0;
        int chuhoa = 0;
        int chuso = 0;

        for (int i = 0; i < nhapchuoi.length(); i++) {
            char c = nhapchuoi.charAt(i); //gán giá trị thứ i của chuỗi cho biến c 
            if (Character.isLowerCase(c)) {
                //kiểm tra xem biến c có phải chữ cái thường không (thông qua phương thức)
                chuthuong++;
            } else if (Character.isUpperCase(c)) {
                chuhoa++;
            } else if (Character.isDigit(c)) {
                chuso++;
            }
        }
        System.out.println("Do dai cua chuoi la: " + nhapchuoi.length());
        System.out.println("So ky tu thuong: " + chuthuong);
        System.out.println("So ky tu hoa: " + chuhoa);
        System.out.println("So chu so: " + chuso);
        sc.close();
    }
}