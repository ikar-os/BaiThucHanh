import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        List<NMT346CAU1> list = new ArrayList<>();
        NMT346CAU1 nmt = new NMT346CAU1();
        nmt.EnterData(list, sc);
        nmt.Insert();
        nmt.Update(list, sc);
        nmt.Display(list);
        nmt.SearchByName();
    }
}
