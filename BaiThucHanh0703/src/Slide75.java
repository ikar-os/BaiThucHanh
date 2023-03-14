import java.util.Scanner;

public class Slide75 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m, i, j, tong = 0;

        do{
            System.out.print("Nhap so dong cua mang: ");
            n = sc.nextInt();
        }while(n <= 0);
        
        do{
            System.out.print("Nhap so cot cua mang: ");
            m = sc.nextInt();
        }while(m <= 0);

        int arrA[][] = new int [n][m];

        for(i=0; i < n; i++){
            for(j=0; j < m; j++){
                System.out.printf("Nhap vao phan tu A[%d][%d]= ", i, j);
                arrA[i][j] = sc.nextInt();
                if(arrA[i][j] % 2 == 0){
                    tong += arrA[i][j];
                }
            }
        }
        System.out.printf("Tong cac so chan cua mang la %d", tong);
    }
}
