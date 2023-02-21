import java.util.Scanner;

class App {
    public static void main(String[] args) {
        int number, tong = 0;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Nhap vao so nguyen duong: ");
        number = input.nextInt();
        
        while (number <= 0){
            System.out.println("Vui long nhap so lon hon 0!");
            number = input.nextInt();
        }

        do {
            tong = tong + number % 10;
            number = number / 10;
        } while (number >0);
        System.out.println("Tong: " + tong);
    }
}
