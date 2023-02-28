import java.util.Scanner;

public class Slide40 {
    public static void main(String[] args) {
        int ngay;
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so ngay trong tuan (so ngay tu 1-7): ");
        ngay = sc.nextInt();
        switch(ngay){
            case 1:
            System.out.println("Hom nay la ngay chu nhat");
            break;
            case 2:
            System.out.println("Hom nay la ngay thu hai");
            break;
            case 3:
            System.out.println("Hom nay la ngay thu ba");
            break;
            case 4:
            System.out.println("Hom nay la ngay thu tu");
            break;
            case 5:
            System.out.println("Hom nay la ngay thu nam");
            break;
            case 6:
            System.out.println("Hom nay la ngay thu sau");
            break;
            case 7:
            System.out.println("Hom nay la ngay thu bay");
            break;
            default:
            System.out.println("So ngay khong hop le!");
        }
        sc.close();
    }
}
