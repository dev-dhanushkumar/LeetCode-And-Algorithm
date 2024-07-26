import java.util.AbstractList;
import java.util.ArrayList;

public class AbstractListAddAll {
    public static void main(String[] args) {
         AbstractList<Integer> list = new ArrayList<Integer> (5);
        
        list.add(100);
        list.add(200);
        list.add(300);


        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1000);
        list2.add(2000);
        list2.add(3000);
        list2.addAll(2, list);

        System.out.println(list2);
    }
}
