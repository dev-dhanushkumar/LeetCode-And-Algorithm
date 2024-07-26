import java.util.ArrayList;
import java.util.ListIterator;

public class AbstractListListIterator {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Sugash");
        list.add("Rama");
        list.add("Siva");
        list.add("Kumar");
        list.add("Sam");
        list.add("Muthu");

        @SuppressWarnings("rawtypes")
        ListIterator listIterator = list.listIterator(3); // 3 is Starting Index Value to End Index

        while(listIterator.hasNext()) {
            System.out.print("List value: "+listIterator.next()+"\n");
        }
    }
}
