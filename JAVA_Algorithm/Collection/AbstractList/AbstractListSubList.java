import java.util.ArrayList;
import java.util.List;

public class AbstractListSubList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");
        list.add("G");
        list.add("H");

        List<String> arr = list.subList(0, 3);
        List<String> sublist = list.subList(0, 3);

        System.out.println(arr);
        System.out.println(sublist);
        System.out.println(list);
    }
}
