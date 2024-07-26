import java.util.ArrayList;

public class ArraylistRemoveRange extends ArrayList<String>{
    public static void main(String[] args) {
        // ArrayList<String> list = new ArrayList<>();
        ArraylistRemoveRange list = new ArraylistRemoveRange();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("K");
        list.add("T");
        list.add("R");

        System.out.println(list);
        list.removeRange(2, 5);
        System.out.println(list);
    }
}
