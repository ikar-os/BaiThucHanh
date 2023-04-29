import java.util.ArrayList;
import java.util.ListIterator;

public class Slider19 {
    public static void main(String[] args) {
        ArrayList<Character> list = new ArrayList<>();
        list.add('a');
        list.add('e');
        list.add('b');
        list.add('c');
        ListIterator<Character> lit = list.listIterator();

        System.out.println("Cac phan tu co trong mang la: ");
        while (lit.hasNext()) {
            System.out.print(lit.next() + "\t");
        } 
    }
}
