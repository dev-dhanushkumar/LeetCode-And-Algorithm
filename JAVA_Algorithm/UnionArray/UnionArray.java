// package Union_Array;

import java.util.ArrayList;
import java.util.HashMap;

public class UnionArray {
    static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        ArrayList<Integer> Union = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            freq.put(arr1[i], freq.getOrDefault(arr1[i],0)+1);
        }
        for(int i = 0; i < m; i++) {
            freq.put(arr2[i], freq.getOrDefault(arr2[i], 0)+1);
        }
        for(int it: freq.keySet()) {
            Union.add(it);
        }
        return Union;
    }
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5,6,7,8,9,0};
        int arr2[] = {5,8,3,21,8,13,11,9};
        ArrayList<Integer> Union = findUnion(arr1, arr2, arr1.length, arr2.length);
        System.out.println(Union);
    }
}
