import java.util.ArrayList;

public class AbstractListIndexOf {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        System.out.println(list.indexOf("B"));
    }
}
