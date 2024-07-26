// package Collection.ArrayList;

import java.util.ArrayList;

class ArraylistContains {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>(4);
 
        // using add() to initialize values
        // [1, 2, 3, 4]
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
 
        // use contains() to check if the element
        // 2 exits or not
        boolean ans = arr.contains(2);
 
        if (ans)
            System.out.println("The list contains 2");
        else
            System.out.println("The list does not contains 2");
    }
}
