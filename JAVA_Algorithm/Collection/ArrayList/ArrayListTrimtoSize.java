package Collection.ArrayList;

import java.util.ArrayList;

public class ArrayListTrimtoSize {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(9);

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.trimToSize();
        System.out.println(list);
    }
}
