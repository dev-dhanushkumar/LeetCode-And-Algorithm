import java.util.ArrayList;

public class AbstractListClear {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1000);
        list.add(2000);
        list.add(3000);
        list.add(4000);

        System.out.println(list);
        list.clear(); // Remove the All the Elements from list
        System.out.println(list);
    }
}
