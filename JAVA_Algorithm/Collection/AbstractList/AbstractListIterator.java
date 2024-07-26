import java.util.ArrayList;
import java.util.Iterator;

public class AbstractListIterator {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        @SuppressWarnings("rawtypes")
        Iterator it = list.iterator();

        while(it.hasNext()) {
            System.out.print("Value is: "+ it.next()+"\n");
        }

    }
}
