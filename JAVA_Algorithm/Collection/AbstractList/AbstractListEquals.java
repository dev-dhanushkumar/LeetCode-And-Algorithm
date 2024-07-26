import java.util.ArrayList;

public class AbstractListEquals {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("D");


        list2.add("A");
        list2.add("B");
        list2.add("C");
        list2.add("D");

        boolean val = list1.equals(list2);
        System.out.println("Are both list Equal: "+ val);

        //OUTPUT: true
    }
}
