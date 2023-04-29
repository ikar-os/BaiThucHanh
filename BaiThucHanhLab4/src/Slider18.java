import java.util.ArrayList;
import java.util.Iterator;

public class Slider18 {
    public static void main(String[] args) throws Exception {
        ArrayList<Float> list = new ArrayList<>();
        list.add(0.7f);
        list.add(7.26f);
        list.add(1.02f);
        list.add(9.3f);
        Iterator<Float> it = list.iterator();

        System.out.println("Cac phan tu co trong mang la: ");
        while (it.hasNext()) {
            System.out.print(it.next() + "\t");
        }
    }
}
