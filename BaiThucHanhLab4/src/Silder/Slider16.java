package Silder;
import java.util.ArrayList;

public class Slider16 {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
    list.add("JAVA");
    list.add("PHP");        
    list.add("C#");        
    list.add("C++");
    
    System.out.println("Cac phan tu co trong mang la: ");
    for(int i = 0; i < list.size(); i++) {
        System.out.print(list.get(i) + "\t");
    }
    }
}