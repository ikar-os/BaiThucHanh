import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i, j;
        do{
            System.out.print("Nhap vao kich thuoc cua mang: ");
            n = sc.nextInt();
        }while(n <= 0);

        int arrA[] = new int [n];
        for(i = 0; i< n; i++){
            System.out.printf("Nhap vao gia tri thu %d: ", i+1);
            arrA[i] = sc.nextInt();
        }
        System.out.print("Mang ban dau la: " );
        for (i = 0; i < n; i++) {
            System.out.print(arrA[i] +" ");
        }

        int temp = arrA[0];
        for(i = 0; i < n-1; i++){
            for(j= i + 1; j < n; j++){
                if( arrA[i] > arrA[j]){
                    temp = arrA[i];
                    arrA[i] = arrA[j];
                    arrA[j] = temp; 
                }
            }
        }
        System.out.println();
        System.out.print("Mang da sap xep la: ");
        for (i = 0; i < n; i++) {
            System.out.print(arrA[i] +" ");
        }
    }
    
}
