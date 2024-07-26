import java.util.ArrayList;

public class AbstractListForEach {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(34);
        list.add(90);
        list.add(12);
        list.add(23);
        list.add(45);

        list.forEach(n -> System.out.println(n));
    }
}
