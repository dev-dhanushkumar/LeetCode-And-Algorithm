package Collection.Vector;

import java.util.Vector;

public class VectorCopyInto {
    public static void main(String[] args) {
        Vector<Integer> vec_tor = new Vector<>();

        vec_tor.add(100);
        vec_tor.add(200);
        vec_tor.add(300);
        vec_tor.add(500);

        System.out.println(vec_tor);
        int[] arr  = new int[6];
        arr[0] = 150;
        for(int ele: arr) {
            System.out.println(ele);
        }
    }
}
