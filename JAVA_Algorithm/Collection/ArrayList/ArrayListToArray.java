package Collection.ArrayList;

import java.util.ArrayList;

public class ArrayListToArray {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

       String[] arr = new String[list.size()];
       arr = list.toArray(arr);

       for(String ele: arr) {
        System.out.println(ele);
       }
    }
}
