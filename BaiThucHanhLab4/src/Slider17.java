import java.util.ArrayList;
public class Slider17 {

    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(7);
        list.add(1);
        list.add(9);

        System.out.println("Cac phan tu co trong mang la: ");
        for (Integer number : list) {
            System.out.print(number + "\t");
        }
    }

}
