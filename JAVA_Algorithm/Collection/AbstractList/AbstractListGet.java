import java.util.ArrayList;

public class AbstractListGet {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(30);
        list.add(20);
        list.add(50);

        int value = list.get(2);
        System.out.println(value);
    }
}
