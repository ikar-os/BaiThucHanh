
import java.util.ArrayList;

public class Slider20 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        System.out.println(list.get(0)); 
        list.add("3");
        list.add("5");
        list.add("7");
        list.remove(2);
        list.set(0, "hi");
        for (String string : list) {
            System.out.print(string + "\t");
        }
        System.out.println("\nso luong phan tu cua mang la: "+list.size());
        System.out.print(list.contains("1"));
    }
}
