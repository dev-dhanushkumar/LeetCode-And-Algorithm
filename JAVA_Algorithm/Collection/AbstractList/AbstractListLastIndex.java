import java.util.ArrayList;

public class AbstractListLastIndex {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add("B");
        list.add("B");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("B");
        list.add("B");

        System.out.println(list.lastIndexOf("I"));
        // OUTPUT: It return last element index could be return.
        // If elemnt not found means it will be return the -1 value
    }
}
