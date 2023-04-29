import java.util.LinkedList;

public class Slider38_39 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Java");
        list.add("C++");
        list.add("PHP");
        list.add("Java");

        System.out.println("Vi du su dung phuong thuc addAll()");
        System.out.println("--------------------------------------");
        LinkedList<String> listA = new LinkedList<String>();
        listA.addAll(list);
        System.out.print("litsA: ");
        showlist(listA);
        System.out.println("\n Vi du phuong thuc retainAll()");
        System.out.println("------------------------------------------");
        LinkedList<String> listB = new LinkedList<String>();
        listA.retainAll(listB);
        System.out.print("ListA: ");
        showlist(listA);

        System.out.println("\n Vi du phuong thuc retainAll()");
        System.out.println("------------------------------------------");
        listA.retainAll(listB);
        System.out.print("List: ");
        showlist(list);

    }

    public static void showlist(LinkedList<String> list) {
        for (String obj : list) {
            System.out.print("\t" + obj + ", ");
        }
        System.out.println();
    }   
}
