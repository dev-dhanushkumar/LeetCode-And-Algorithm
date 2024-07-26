import java.util.ArrayList;

public class AbstractListisEmpty {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        list.clear();
        if (list.isEmpty()) {
            System.out.println("Array List is empty!");
        } else {
            System.out.println("Arraylist Not Empty");
        }
    }
}
