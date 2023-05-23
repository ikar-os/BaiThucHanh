import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int n;
        int i = 0;
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Mang so nguyen");
                System.out.print("Nhap vao kich thuoc cua mang: ");
                n = sc.nextInt();
                int ArrA[] = new int[n];
                do {
                    
                    try {
                        for (; i < n; i++) {
                        
                            System.out.print("Nhap vao phan tu thu " + (i + 1) + " cua mang: ");
                            ArrA[i] = sc.nextInt();
                        }
                    } catch (Exception e) {
                        ArrA[i] = 0;
                    }
                } while (ArrA[i] ==0);
            } catch (Exception e) {
                n = 0; 
                
                // System.out.println(e);
    
            }

        } while (n==0);

        

    }
}
