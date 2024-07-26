import java.util.*;

public class AbstractListDemo {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        AbstractList<Integer> list = new ArrayList<Integer> (5);
        
        list.add(100);
        list.add(200);
        list.add(300);
        
        System.out.println(list);
    }
}
