import java.util.Scanner;

public class Slide74 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n , i, tong = 0;
        do{
            System.out.print("Nhap vao kich thuoc cua mang: ");
            n = sc.nextInt();
        }while(n <= 0);
        int arrA[] = new int [n];
        for(i = 0; i< n; i++){
            System.out.printf("Nhap vao gia tri thu %d: ", i+1);
            arrA[i] = sc.nextInt();
            if(arrA[i] % 2 ==0){
                tong += arrA[i];
            }
        }
        System.out.printf("Tong cac so chan cua mang la %d", tong);
    }
}
