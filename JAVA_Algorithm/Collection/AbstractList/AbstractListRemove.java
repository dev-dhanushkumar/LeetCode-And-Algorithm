import java.util.ArrayList;

public class AbstractListRemove {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");


        System.out.println(list);

        list.remove(2);  // Remove the element based on index
        System.out.println(list);
    }
}
