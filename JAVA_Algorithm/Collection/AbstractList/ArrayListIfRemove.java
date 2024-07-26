import java.util.ArrayList;

public class ArrayListIfRemove {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(11);
        list.add(20);
        list.add(33);

        System.out.println(list);
        list.removeIf(n -> (n % 2 == 0));
        System.out.println(list);

    }

    public static ArrayList<Integer> soritng(ArrayList<Integer> list) {
        return list;    
    }
}
