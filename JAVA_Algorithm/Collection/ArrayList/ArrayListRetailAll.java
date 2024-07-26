package Collection.ArrayList;

import java.util.ArrayList;

public class ArrayListRetailAll {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        list.add("apple");
        list.add("Elephant");
        list.add("Cat");
        list.add("Paper");

        list2.add("apple");
        list2.add("Red");
        list2.add("Box");
        list2.add("Cat");

        System.out.println(list);
        System.out.println(list2);
        
        System.out.println("After list.retainAll() executed...");
        list.retainAll(list2); // Inthis function do the Basic Implementation of compare the two values
        
        System.out.println(list);
        System.out.println(list2);

    }
}
