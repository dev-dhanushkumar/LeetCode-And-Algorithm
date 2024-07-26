import java.util.ArrayList;

public class AbstractListSet {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        System.out.println(list);
        list.set(2, "Here Update me!"); // update element based on the index value
        System.out.println(list);
    }
}
