import java.util.ArrayList;

public class AbstractListHashCode {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        System.out.println(list);
        System.out.println(list.hashCode());
        list.clear();
        System.out.println(list.hashCode());
    }
}
