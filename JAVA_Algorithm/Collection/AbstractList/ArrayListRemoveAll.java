import java.util.ArrayList;

public class ArrayListRemoveAll {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        System.out.println(list);
        list.removeAll(list);
        System.out.println(list);

    }
}
